# 🎓 Student Data Management System
(Java, Collections, Exception Handling)

A **console-based Java project** to manage student records using `HashMap`.  
It allows adding, updating, deleting, searching, and displaying student details, along with finding the topper, lowest scorer, total, and average marks.  
The project demonstrates **Java Collections Framework, Exception Handling, Validations, and Case-Insensitive Search (equalsIgnoreCase)**.

---

## 🚀 Features
- ✅ Add student with name and marks (validations applied)  
- ✅ Update marks (case-insensitive student name matching)  
- ✅ Delete student record safely  
- ✅ Search student record (ignores case)  
- ✅ Display all students with marks  
- ✅ Show **Topper (highest marks)**  
- ✅ Show **Lowest scorer (lowest marks)**  
- ✅ Calculate **Total & Average marks**  
- ✅ Handles invalid inputs & exceptions gracefully  

---

## 🛠️ Concepts Used
- **Java Collections Framework**
  - `HashMap<String, Integer>` to store student data  
  - `Collections.max()` & `Collections.min()` for topper/lowest scorer  

- **Control Structures**
  - `do-while`, `switch-case` for menu-driven program  

- **Exception Handling**
  - `try-catch` blocks to handle invalid inputs  
  - Prevents program crashes from wrong user inputs  

- **Validations**
  - Marks restricted between `0 – 100`  
  - Prevents duplicate student names  
  - Case-insensitive student search using `equalsIgnoreCase`  

- **OOP Concepts**
  - Utility method `findKeyIgnoreCase()` for reusability  
  - Encapsulation of logic within methods  

---

📂 Project Structure

StudentDataManagement/
│── src/
│ └── com/student_record/StudentDataManagement.java
│── README.md
│── .gitignore

---

📌 Sample Menu
---- Student Data ----
1. Add Student
2. Update Marks
3. Delete Student
4. Search Student
5. Display All Students
6. Show Topper
7. Show Lowest Scorer
8. Show Total and Average Marks
9. Exit

---

🎯 Example Run
Enter your Choice: 1
Enter Student Name: Smith
Enter Marks: 95
✅ Student added successfully!

Enter your Choice: 6
🏆 Topper: Smith : 95

---

🔮 Future Enhancements

Add sorting options (by marks or name)

Save/load student data from file or database

---

👩‍💻 Author

Chaitali Shende
📌 Passionate about Java, Collections, OOP, and building real-world projects.




## 📂 Project Structure
