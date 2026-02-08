package problem4;
import problem1.Student;
import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course course = new Course("OOP", 5);
        GradeBook gb = new GradeBook(course);
        System.out.print("How many students?");
        int n= sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Student name: ");
            String name = sc.next();

            int id= i+1;

            System.out.print("Grade: ");
            int grade = sc.nextInt();

            Student s=new Student(name,id);
            gb.addStudent(s, grade);
        }
        gb.displayMessage();
        gb.displayGradeReport();
        System.out.println(gb);
    }
}
