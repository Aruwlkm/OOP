package problem1;
import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("Q")) break;

            try {
                double num = Double.parseDouble(input);
                data.add(num);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMax());
    }
}

