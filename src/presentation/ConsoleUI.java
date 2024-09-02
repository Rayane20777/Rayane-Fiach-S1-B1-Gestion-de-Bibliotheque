package presentation;

import metier.Book;
import metier.Magazine;
import metier.Document;
import utilitaire.DateUtils;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;


public class ConsoleUI {

    private final Scanner scanner;
    private final List<Book> books;
    private final List<Magazine> magazines;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        books = new ArrayList<>();
        magazines = new ArrayList<>();
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



                    if (docChoice == 1) {
                        Book book = new Book();
                        book.add(scanner);
                        books.add(book);
                        System.out.println("Book added successfully");
                    } else if (docChoice == 2) {
                        Magazine magazine = new Magazine();
                        magazine.add(scanner);
                        magazines.add(magazine);
                        System.out.println("Magazine added successfully");
                    } else {
                        System.out.println("Invalid Choice");
                    }

                    break;
                case 2:

                    break;
                case 3:
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

