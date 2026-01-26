package practice1;
import java.util.Scanner;
public class Problem5{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Initial balance: ");
        double balance=scanner.nextDouble();
        System.out.print("Interest rate: ");
        double rate=scanner.nextDouble();
        double newBalance=balance+(balance * rate / 100);
        System.out.println("New balance: "+newBalance);
    }
}