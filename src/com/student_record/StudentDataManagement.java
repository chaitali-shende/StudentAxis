package com.student_record;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDataManagement
{
		public static void main(String[] args) 
		{
			HashMap<String, Integer> student = new HashMap<String, Integer>();
			
			Scanner sc = new Scanner(System.in);
			int choice=0 ;
			do
			{
				try {
					
					    System.out.println("\n---- Student Data ----");
		                System.out.println("1. Add Student");
		                System.out.println("2. Update Marks");
		                System.out.println("3. Delete Student");
		                System.out.println("4. Search Student");
		                System.out.println("5. Display All Students");
		                System.out.println("6. Show Topper");
		                System.out.println("7. Show Lowest Scorer");
		                System.out.println("8. Show Total and Average Marks");
		                System.out.println("9. Exit");
			            System.out.println("Enter your Choice: ");
			
			    // Validate numeric input
	            if (!sc.hasNextInt()) {
	                System.out.println("Invalid input! Please enter a number.");
	                sc.nextLine(); // clear invalid input
	                continue;
	            }

	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline
			
			switch(choice)
			{
			case 1 :
				System.out.print("Enter Student Name:");
				String name1 = sc.nextLine().trim();
				
				if (name1.isEmpty()) {
	                System.out.println("Name cannot be empty!");
	                break;
	            }
				 // Prevent duplicate names (ignore case)
	            if (findKeyIgnoreCase(student, name1) != null) {
	                System.out.println("Student already exists. Use Update instead.");
	                break;
	            }
	            
				System.out.print("Enter Marks:");
				 if (!sc.hasNextInt()) {
	                 System.out.println("Invalid marks! Please enter numbers only.");
	                 sc.nextLine();
	                 break;
	             }
				 int marks = sc.nextInt();
	             sc.nextLine();
				
				if (marks < 0 || marks > 100) {
	                System.out.println("Marks must be between 0 and 100.");
	                break;
	            }
				
				student.put(name1, marks);
				System.out.println("Student added successfully!");
				break;
				
			case 2 :
				System.out.print("Enter student name to update the marks :");
				String name2 = sc.nextLine().trim();
				
				String keyToUpdate = findKeyIgnoreCase(student, name2);
				
				if(student.containsKey(name2))
				{
				System.out.print("Enter new marks:");
				if (!sc.hasNextInt() ) {
	                System.out.println("Invalid marks! Please enter numbers only.");
	                sc.nextLine();
	                break;
	            }
				 int newMarks = sc.nextInt();
	             sc.nextLine();
	             
				 if (newMarks < 0 || newMarks > 100) {
	                 System.out.println("Marks must be between 0 and 100.");
	                 break;
	             }
				student.put(keyToUpdate, newMarks);
				System.out.println(student.toString());
				}
				else
				{
					System.out.println("Student not found.");
				}
				break;
				
			case 3 :
				System.out.print("Enter student name to delete:");
				String name3 = sc.nextLine().trim();
				
				 String keyToDelete = findKeyIgnoreCase(student, name3);
				 
				if(student.containsKey(name3)) {
				    student.remove(name3);
				    System.out.println("Student deleted.");
				} else {
				    System.out.println("Student not found.");
				}
				
				System.out.println("Student data after Removal:"+student);
				break;
				
			case 4 :
				System.out.print("Enter student name to search:");
				String nameToSearch = sc.nextLine();
				
				String keyToSearch = findKeyIgnoreCase(student, nameToSearch);
				 
				if (keyToSearch != null) {
				    System.out.println(nameToSearch + " Scored " + student.get(nameToSearch));
				} else {
				    System.out.println("Student not found.");
				}
				break;
				
			case 5 :
				 System.out.println("---- Student Records ----");
	             if (student.isEmpty()) {
	                 System.out.println("No records found.");
	             } else {
	                 student.forEach((key, val) -> System.out.println("Name: " + key + " | Marks: " + val));
	             }
				break;
				
			case 6://Highest Scorer
				if (!student.isEmpty()) {
	                Map.Entry<String, Integer> topper =
	                        Collections.max(student.entrySet(), (s1, s2) -> s1.getValue().compareTo(s2.getValue()));
	                System.out.println("Topper: " + topper.getKey() + " : " + topper.getValue());
	            } else {
	                System.out.println("No records found.");
	            }
	            break;
				
			case 7://Lowest Scorer
				if (!student.isEmpty()) {
	                Map.Entry<String, Integer> lower =
	                        Collections.min(student.entrySet(), (s1, s2) -> s1.getValue().compareTo(s2.getValue()));
	                System.out.println("Lowest Scorer: " + lower.getKey() + " : " + lower.getValue());
	            } else {
	                System.out.println("No records found.");
	            }
				break;
				
			case 8:
				if (!student.isEmpty()) {
				    int sum = 0;
				    for (Integer values : student.values()) {
				        sum += values;
				    }
				    System.out.println("Total Marks: " + sum);
				    System.out.println("Average Marks: " + (double) sum / student.size());
				} else {
				    System.out.println("No student records available.");
				}
				break;
			
			case 9 :
				System.out.println("Exiting... Thank you!");
				System.exit(0);
				
			default :
				System.out.println("Invalid Choice.");	
			 }
		}
			catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	            sc.nextLine(); // clear buffer in case of exception
	        }
		}
			while(choice!=9);	
			sc.close();
		}
			
			 // Utility method: Find key ignoring case
		    private static String findKeyIgnoreCase(HashMap<String, Integer> student, String name) {
		        for (String key : student.keySet()) {
		            if (key.equalsIgnoreCase(name)) {
		                return key;
		            }
		        }
		        return null;
	}
}

