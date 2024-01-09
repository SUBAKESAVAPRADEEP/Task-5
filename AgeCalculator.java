package Pradeep;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the birthdate (yyyy-mm-dd): ");
        String birthdate = scanner.nextLine();

        // Parse the input string into a LocalDate object
        LocalDate birthdateDate = LocalDate.parse(birthdate);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and current date
        Period period = Period.between(birthdateDate, currentDate);

        // Extract the years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Print the output
        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");

        scanner.close();
    }

}
