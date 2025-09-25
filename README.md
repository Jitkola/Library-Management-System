# Library Management System

## Overview
This is a **simple console-based Library Management System** implemented in **Java**.  
The system allows a library to **manage books and users**, and supports basic operations like:

- Adding books and users  
- Issuing books to users  
- Returning books  
- Viewing all books and users  

The program uses **Scanner** for interactive input and **ArrayLists** to store books and users.

---

## Features
- **Add Book**: Add a new book with ID, title, and author.  
- **Add User**: Add a new library user with ID and name.  
- **Issue Book**: Assign a book to a user if available.  
- **Return Book**: Return a previously issued book.  
- **Display Books**: Show all books with availability status.  
- **Display Users**: Show all users and the number of books they have borrowed.  
- **Interactive Menu**: Easy to navigate menu using the console.  

---

## Classes

| Class      | Description                                                                 |
|------------|-----------------------------------------------------------------------------|
| `Book`     | Represents a book with ID, title, author, and availability status.         |
| `User`     | Represents a library user with ID, name, and a list of borrowed books.     |
| `Library`  | Manages books and users. Contains methods to add, issue, return, and display.|
| `Main`     | Entry point of the program. Provides a console menu to interact with the library.|

---

## How It Works
1. Create a **Library object**.  
2. Use the **menu** to add books and users.  
3. Issue or return books by entering **book ID** and **user ID**.  
4. Display books and users to track status and borrowed books.  
5. Exit the program when done.

---

---

## Screenshots

1. **Add Book (Book 1)** – Screenshot 1  
2. **Add Book (Book 2)** – Screenshot 2  
3. **Add Book (Book 3) & Add User (User 1)** – Screenshot 3  
4. **Add User (User 2)** – Screenshot 4  
5. **Issue Book** – Screenshot 5  
6. **Show Books** – Screenshot 6  
7. **Show Users** – Screenshot 7  
8. **Return Book** – Screenshot 8  
9. **Show Books (after return)** – Screenshot 9  
10. **Show Users (after return) and Exit** – Screenshot 10  

