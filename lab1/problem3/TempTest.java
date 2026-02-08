package problem3;

import java.util.Scanner;
public class TempTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temp value: ");
        double value= sc.nextDouble();
        System.out.print("Enter scale (C/F): ");
        char scale=sc.next().charAt(0);

        Temperature t=new Temperature(value,scale);
        System.out.println("Celcius: "+ t.getCelsius());
        System.out.println("Fahrenheit: "+t.getFahrenheit());
    }
}
