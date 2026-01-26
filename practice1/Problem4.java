package practice1;
import java.util.Scanner;
public class Problem4{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("a: ");
        int a=scanner.nextInt();
        System.out.print("b: ");
        int b=scanner.nextInt();
        System.out.print("c: ");
        int c=scanner.nextInt();

        int D= b*b - 4*a*c;
        if(D<0){
            System.out.println("Error");
        }
        else{
           double sqrtD=Math.sqrt(D);
           double x1=(-b+sqrtD)/(2*a);
           double x2=(-b-sqrtD)/(2*a);
           System.out.println("D: "+D);
           System.out.println("x1: "+x1);
           System.out.println("x2: "+x2);
        }
    }
}