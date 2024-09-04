Library Management System

  Project Overview

This project is a console-based Library Management System developed in Java 8.
The system is designed to automate the management of a municipal library's inventory of books and magazines,
as well as handle the borrowing and returning of these documents.

  Table of Contents

* Project Overview
* Features
* Project Structure
* Technical Specifications
* Getting Started
* Usage
* Contributing


Features

* Add Document: Add new books or magazines to the library inventory.
* Borrow Document: Borrow a book or magazine from the library.
* Return Document: Return a previously borrowed book or magazine.
* Display All Documents: View all books and magazines currently in the library's inventory.
* Search Document: Search for a specific book or magazine by title.
* Interactive Console Menu: A user-friendly menu for interacting with the system.

Project Structure

Layers :
1. Presentation Layer:

* ConsoleUI.java - Handles user interaction through a console-based interface.

2. Business Layer (Métier):

* Document.java (Abstract) - The base class for Book and Magazine.
* Book.java - Represents a book and implements the document operations.
* Magazine.java - Represents a magazine and implements the document operations.
* Bibliotheque.java - Manages the collection of books and magazines.

3. Utility Layer:

* DateUtils.java - Contains utility methods for handling dates.

Main Class

* Library.java - The entry point for the application, initializing the ConsoleUI to start the application.

  Technical Specifications

* Java Version: 8
* Data Storage: ArrayList for storing books and magazines.
* Search Optimization: HashMap<String, Document> for quick lookup by title.
* Date Handling: Java Time API for managing dates.
* Java Concepts: Utilizes inheritance, encapsulation, and lambda expressions.
* Version Control: Managed with Git.
* Project Management: Tracked with JIRA.

  Getting Started
  
Prerequisites
* Java 8: Ensure Java 8 is installed on your machine.
* IDE: Use any Java IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor.

  Usage

Upon running the application, an interactive menu will be displayed:

1. Add Document: Choose whether to add a book or a magazine.
2. Borrow Document: Borrow a book or a magazine by entering its title.
3. Return Document: Return a borrowed book or magazine by entering its title.
4. Display All Documents: View all books and magazines in the inventory.
5. Search Document: Search for a specific book or magazine by title.
6. Quit: Exit the application.

  Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your changes.
Ensure that your code adheres to the existing coding standards and passes all tests.
  







































  
