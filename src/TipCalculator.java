import java.util.Scanner;

public class TipCalculator {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter a cost in dollars and cents: ");
        double cost = scan.nextDouble();
        double total = cost;
        while (cost != -1.0) {
            System.out.print("Enter a cost in dollars and cents: ");
            cost = scan.nextDouble();
            total += cost;
            total ++;
        }

        double totalTip = total * (tipPercentage / 100.0);

        System.out.print("------------------------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total Percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total bill with tip: $" + (total + totalTip));

    }
}