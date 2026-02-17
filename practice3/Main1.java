package practice3;
import java.util.Scanner;
import java.util.Vector;
public class Main1 {
    public static void main(String[] args) {
        Vector<practice3.Person1> people = new Vector<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Add person");
            System.out.println("2 - Print all");
            System.out.println("3 - Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {

                System.out.println("Choose type: 1-Person, 2-Student, 3-Staff");
                int type = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                if (type == 1) {
                    people.add(new practice3.Person1(name, address));
                }
                else if (type == 2) {
                    System.out.print("Program: ");
                    String program = sc.nextLine();

                    System.out.print("Year: ");
                    int year = sc.nextInt();

                    System.out.print("Fee: ");
                    double fee = sc.nextDouble();
                    sc.nextLine();

                    people.add(new practice3.Student(name, address, program, year, fee));
                }
                else if (type == 3) {
                    System.out.print("School: ");
                    String school = sc.nextLine();

                    System.out.print("Pay: ");
                    double pay = sc.nextDouble();
                    sc.nextLine();

                    people.add(new practice3.Staff(name, address, school, pay));
                }
            }
            else if (choice == 2) {
                for (practice3.Person1 p : people) {
                    System.out.println(p);
                }
            }
            else break;
        }
    }
}
