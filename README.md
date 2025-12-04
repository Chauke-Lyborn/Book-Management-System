
# Book Management System (OOP + GUI + JUnit Project)

## Overview
This project simulates the books section of an online store.  
The system allows storing details of printed books and ebooks using inheritance, interfaces, exception handling, GUI interaction, and JUnit testing.

It demonstrates:
- Abstract classes
- Polymorphism
- Exception validation
- Swing GUI development
- Unit testing using JUnit

---

## Features

### Add Books
Allows adding both printed books and ebooks to the system.  
The GUI automatically identifies book type using the ISBN number.

### ISBN Validation
The program validates ISBN numbers:
- Must be 10 characters
- Last digit may be `B` or a number
- Throws clear error messages for invalid entries

### View Printed Book Details
Displays titles, number of pages, and weight of printed books using the `getSizeDetails()` method.

### View EBook Size Details
Displays titles and file size (in KB) of ebooks using the `getSizeDetails()` method.

### GUI Application
The BookEntryScreen allows:
- Input of book details via Swing controls
- Adding a book to an ArrayList
- Displaying recently added books to a text area
- Listing printed book weight details
- Listing ebook size details

### JUnit Testing
Includes a test class to verify ISBN validation logic through multiple test cases.

---

## Technologies Used
- **Programming Language:** Java  
- **Framework:** Swing GUI / JUnit testing  
- **IDE:** NetBeans  

---

## Usage Instructions
1. Run the program to open the Book Entry screen.
2. Enter the book title, author, and ISBN number.
3. The system detects whether it is:
   - A printed book (ISBN starts with 1)  
   - An ebook (ISBN starts with 0)
4. If valid, the book is stored in the system list.
5. Use the buttons on the GUI:
   - **Save Book:** Adds the selected book to the list
   - **View Weight of Books:** Shows printed book weight details
   - **View Size of Books:** Shows ebook size information
6. If an invalid ISBN is entered, an exception message is shown.

---

## Author
This project was developed as part of an academic assignment to learn Java OOP concepts, exception handling, GUI development, and JUnit testing.


