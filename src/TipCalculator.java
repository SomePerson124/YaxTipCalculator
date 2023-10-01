/*
Author: Antonio Yax
This class asks a user to input how many people are in their group, a tip percentage, and multiple costs.
Valuable information is then printed to the user.
I learned how to round from here: https://stackoverflow.com/questions/13210491/math-round-java
 */

import java.util.Scanner;

public class TipCalculator {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        // greets the user and asks them how many people are in their group
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        // suggests tip amounts and asks the user what the tip percentage is
        System.out.println("Here are some suggested tip percentages: ");
        System.out.println("15%");
        System.out.println("20%");
        System.out.println("25%");
        System.out.print("What's the tip percentage? ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        // if the tip percentage inputted is less than 15,
        // the program will ask the user if they are sure about their tip percentage
        // and ask for the user to input a tip percentage again
        if (tipPercentage < 15) {
            System.out.println("Are you sure you don't want to increase the tip percentage?");
            System.out.print("What's the tip percentage? ");
            tipPercentage = scan.nextInt();
            scan.nextLine();
        }
        // asks for a cost
        // and stores it as the total
        System.out.print("Enter a cost in dollars and cents: ");
        double cost = scan.nextDouble();
        double total = cost;
        // while the cost is not equal to -1
        // the program will continue asking for costs
        // and keep adding it to the total
        while (cost != -1.0) {
            System.out.print("Enter a cost in dollars and cents: ");
            cost = scan.nextDouble();
            total += cost;
        }
        // adds 1 to the cost to not count the -1 inputted at the end
        total ++;
        // calculates the total tip
        double totalTip = total * (tipPercentage / 100.0);
        // calculates the total bill including the tip
        double totalCostAfterTip = total + totalTip;
        // calculates and/or prints valuable information for the user
        System.out.println("------------------------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total Percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + Math.round(totalTip * 100.0) / 100.0);
        System.out.println("Total bill with tip: $" + Math.round(totalCostAfterTip * 100.0) / 100.0);
        System.out.println("Per person cost before tip: $" + Math.round((total / numPeople) * 100.0) / 100.0);
        System.out.println("Tip per person: $" + Math.round((totalTip / numPeople) * 100.0) / 100.0);
        System.out.print("Total cost per person: $" + Math.round((totalCostAfterTip / numPeople) * 100.0) / 100.0);

    }
}