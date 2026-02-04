package problem1;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aru", 1);
        student1.displayDetails();
        System.out.println("After increment");
        student1.incrementID();
        student1.displayDetails();
    }
}
