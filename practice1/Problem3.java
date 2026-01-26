package practice1;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your mark: ");
        double mark= scanner.nextDouble();
        if(mark>=0 && mark<49.5){
            System.out.println("F");
        }
        else if(mark>=49.5 && mark<54.5){
            System.out.println("D");
        }
        else if (mark>=54.5 && mark<59.5 ){
            System.out.println("D+");
        }
        else if (mark>=59.5 && mark<64.5 ){
            System.out.println("C-");
        }
        else if (mark>=64.5 && mark<69.5 ){
            System.out.println("C+");
        }
        else if (mark>=69.5 && mark<74.5 ){
            System.out.println("C+");
        }
        else if (mark>=74.5 && mark<79.5 ){
            System.out.println("B-");
        }
        else if (mark>=79.5 && mark<84.5 ){
            System.out.println("B");
        }
        else if (mark>=84.5 && mark<89.5 ){
            System.out.println("B+");
        }
        else if (mark>=89.5 && mark<94.5 ){
            System.out.println("A-");
        }

        else {
            System.out.println("A");
        }
    }
}