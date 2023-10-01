/*
Author: Antonio Yax
This class asks a user to input how many people are in their group, a tip percentage, and multiple costs. The
I learned how to round from here: https://stackoverflow.com/questions/13210491/math-round-java
 */

import java.util.Scanner;

public class TipCalculator {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.println("Here are some suggested tip percentages: ");
        System.out.println("15%");
        System.out.println("20%");
        System.out.println("25%");
        System.out.print("What's the tip percentage? ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        if (tipPercentage < 15) {
            System.out.println("Are you sure you don't want to increase the tip percentage?");
            System.out.print("What's the tip percentage? ");
            tipPercentage = scan.nextInt();
            scan.nextLine();
        }

        System.out.print("Enter a cost in dollars and cents: ");
        double cost = scan.nextDouble();
        double total = cost;
        while (cost != -1.0) {
            System.out.print("Enter a cost in dollars and cents: ");
            cost = scan.nextDouble();
            total += cost;
        }
        total ++;

        double totalTip = total * (tipPercentage / 100.0);
        double totalCostAfterTip = total + totalTip;

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