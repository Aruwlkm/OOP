package practice1;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.print("Enter a: ");
        int a= scanner.nextInt();
        double b =a;
        System.out.println("Area: " +a*a);
        System.out.println("Perimeter: " +4*a);
        System.out.println("Diagonal: " +b*Math.sqrt(2));
    }
}