import java.util.Scanner;

public class IT22889942Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kg = input.nextDouble();

        double total = price * kg;
        double finalAmount = total - (total * 0.10);   // 10% discount

        System.out.println("\nThe total amount with 10% discount is: " + finalAmount);

        input.close();
    }
}