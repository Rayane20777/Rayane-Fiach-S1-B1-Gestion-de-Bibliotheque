package utilitaire;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateUtils {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Parses a string into a LocalDate object, handling potential errors
    public static LocalDate parseDate(String dateStr) {
        try {
            return LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use the format dd/MM/yyyy.");
            return null;
        }
        //test
    }

    // Formats a LocalDate object into a string
    public static String formatDate(LocalDate date) {
        if (date == null) {
            return "Invalid date";
        }
        return date.format(formatter);
    }
    private int getValidatedIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
