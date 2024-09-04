package presentation;

import metier.Book;
import metier.Magazine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class ConsoleUI {

    private final Scanner scanner;
    private final List<Book> books;
    private final List<Magazine> magazines;
    private final HashMap<String, Book> bookMap;
    private final HashMap<String, Magazine> magazineMap;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        books = new ArrayList<>();
        magazines = new ArrayList<>();
        bookMap = new HashMap<>();
        magazineMap = new HashMap<>();

    }


        public void start(){
            while(true){
                System.out.println("******************************************");
                System.out.println("*  Veuillez entrer votre choix (1-6) :   *");
                System.out.println("*  1. Ajouter un document                *");
                System.out.println("*  2. Emprunter un document              *");
                System.out.println("*  3. Retourner un document              *");
                System.out.println("*  4. Afficher tous les documents        *");
                System.out.println("*  5. Rechercher un document             *");
                System.out.println("*  6. Quitter                            *");
                System.out.println("******************************************");

                int choice = scanner.nextInt();
                handleUserChoice(choice);

            }
        }

        private void handleUserChoice(int choice) {
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("******************************************");
                    System.out.println("For \"Book\" choose \"1\" or choose \"2\" for \"Magazine\" ");
                    System.out.println("******************************************");
                    int docChoice = scanner.nextInt();
                    scanner.nextLine();



                    if (docChoice == 1)  {
                        Book book = new Book();
                        book.add(scanner);
                        books.add(book);
                        bookMap.put(book.getTitle().toLowerCase(), book);
                        System.out.println("Book added successfully");
                    } else if (docChoice == 2) {
                        Magazine magazine = new Magazine();
                        magazine.add(scanner);
                        magazines.add(magazine);
                        magazineMap.put(magazine.getTitle().toLowerCase(), magazine);
                        System.out.println("Magazine added successfully");
                    } else {
                        System.out.println("Invalid Choice");
                    }

                    break;
                case 2:
                    System.out.println("******************************************");
                    System.out.println("Document borrowing");
                    System.out.println("For \"Book\" choose \"1\" or choose \"2\" for \"Magazine\" ");
                    System.out.println("******************************************");
                    int docBorrow = scanner.nextInt();
                    scanner.nextLine();

                    if (docBorrow == 1) {
                        System.out.println("Enter name for book to borrow");
                        String bookName = scanner.nextLine().toLowerCase();
                        Book book = bookMap.get(bookName);

                        System.out.println(book);
                        if (book != null) {
                            book.borrow();
                            System.out.println("Book borrowed successfully");

                        }else{
                            System.out.println("Book not found");

                        }

                    } else if (docBorrow == 2) {
                        System.out.println("Enter name for magazine to borrow");
                        String magazineName = scanner.nextLine();
                        Magazine magazine = magazineMap.get(magazineName.toLowerCase());
                        if (magazine != null) {
                            magazine.borrow();
                            System.out.println("Magazine borrowed successfully");

                        }else{
                            System.out.println("Magazine not found");
                        }

                    }else{
                        System.out.println("Invalid Choice");
                    }


                    break;
                case 3:
                    System.out.println("******************************************");
                    System.out.println("Document returns");
                    System.out.println("To return a \"Book\" choose \"1\" or choose \"2\" for \"Magazine\" ");
                    System.out.println("******************************************");
                    int docReturn = scanner.nextInt();
                    scanner.nextLine();
                    if (docReturn == 1) {
                        System.out.println("Enter name for book to return");
                        String bookName = scanner.nextLine().toLowerCase();
                        Book book = bookMap.get(bookName);
                        System.out.println(book);
                        if (book != null) {
                            book.returnDocument();
                            System.out.println("Book returned successfully");
                        }else{
                            System.out.println("Book not found");
                        }

                    }else if (docReturn == 2) {
                        System.out.println("Enter name for magazine to return");
                        String magazineName = scanner.nextLine().toLowerCase();
                        Magazine magazine = magazineMap.get(magazineName.toLowerCase());
                        if (magazine != null) {
                            magazine.returnDocument();
                            System.out.println("Magazine returned successfully");
                        }else{
                            System.out.println("Magazine not found");
                        }
                    }else{
                        System.out.println("Invalid Choice");
                    }
                    break;
                case 4:
                    System.out.println("Display Books or Magazine");
                    System.out.println("1 for Books , 2 for Magazine");
                    int displayChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (displayChoice == 1) {
                        for (Book book : books) {
                            book.displayDetails();
                            System.out.println();
                        }
                    } else if (displayChoice == 2) {
                        for (Magazine magazine : magazines) {
                            magazine.displayDetails();
                            System.out.println();
                        }
                    } else {
                        System.out.println("Invalid Choice");
                    }

                    break;
                case 5:
                    System.out.println("Display Books or Magazine");
                    System.out.println("To Search for a \"Book\" choose \"1\" or choose \"2\" for \"Magazine\" ");
                    System.out.println("*****************************************");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine();


                    if (searchChoice == 1) {
                        System.out.println("Enter name for book to display");
                        String bookTitle = scanner.nextLine();
                        Book.search(books, bookTitle);

                    } else if (searchChoice == 2) {
                        System.out.println("Enter name for magazine to display");
                        String magazineTitle = scanner.nextLine();
                        Magazine.search(magazines, magazineTitle);

                    }else{
                        System.out.println("Invalid Choice");
                    }


                    break;
                case 6:
                    System.out.println("Merci d'avoir utilisé l'application.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }

        }

