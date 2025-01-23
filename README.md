# University System

This project is a **University System** built in Java, showcasing Object-Oriented Programming (OOP) principles. It allows users to perform operations like managing student information and interacting with various functionalities such as creating, updating, deleting, and displaying student details.

## Features

1. **Add New Students**:
   - Capture and store student details, including:
     - Name
     - Age
     - Address
     - Nationality
     - Level
     - Specialization
     - GPA

2. **Update Student Details**:
   - Modify specific fields of an existing student record.

3. **Delete Students**:
   - Remove a student's details from the system.

4. **View Student Details**:
   - Display all details of a specific student.

5. **Menu-Based Navigation**:
   - Intuitive menu-driven interface using `do-while` and `switch` statements.

## Technology Stack

- **Programming Language**: Java
- **Paradigm**: Object-Oriented Programming (OOP)
- **Development Tools**: GitHub for version control

## Project Structure

```
University-System/
├── src/              # Source files
├── LICENSE           # License information
├── README.md         # Project documentation
├── Person.class      # Compiled Java class file
└── .gitignore        # Ignored files configuration
```

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/turki013/University-System.git
   cd University-System
   ```

2. **Run the Program**:
   - Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
   - Compile and run the `src` directory.

## Usage

### Adding a New Student:
1. Launch the program.
2. Choose the option to add a new student.
3. Enter the required details.

### Updating Student Information:
1. Choose the update option.
2. Select the field to be modified.
3. Save changes.

### Deleting a Student:
1. Choose the delete option.
2. Confirm the deletion of the selected student.

### Viewing Student Details:
1. Select the view option.
2. Display all relevant details.

### Exiting the Program:
- Select the exit option from the main menu.

## Code Example

```java
// Example of adding a student
Student s1 = new Student("John Doe", 20, "123 Main St", "American", 2, "Computer Science", 3.5);
s1.displayDetails();
```

## Output Example

```
--- Student Details ---
Name: John Doe
Age: 20
Address: 123 Main St
Nationality: American
Specialization: Computer Science
Level: 2
GPA: 3.5
```

## Future Improvements

- Implement a database for persistent storage.
- Add authentication and role-based access control.
- Expand functionalities to include course and faculty management.
- Improve error handling and input validation.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contributions

Contributions are welcome! Feel free to fork the repository, create a feature branch, and submit a pull request.

## Contact

For any inquiries or feedback, please contact:
- **Author**: Turki
- **GitHub**: [turki013](https://github.com/turki013)
- **Telegram**: DataScience18
---
**Note**: This project is intended for educational purposes and demonstrates basic OOP concepts in Java.
