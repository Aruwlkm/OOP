package problem1;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }
    public void displayDetails() {
        System.out.println("Name - " + name);
        System.out.println("ID - " + id);
        System.out.println("Year of Study - " + yearOfStudy);
    }
    public void incrementID() {
        id+=1;
    }
}
