import java.util.Scanner;

public class IT22889942Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        int d5 = number / 10000;            // ten-thousands
        int d4 = (number / 1000) % 10;      // thousands
        int d3 = (number / 100) % 10;       // hundreds
        int d2 = (number / 10) % 10;        // tens
        int d1 = number % 10;               // ones

        System.out.println(d5 + " " + d4 + " " + d3 + " " + d2 + " " + d1);

        input.close();
    }
}