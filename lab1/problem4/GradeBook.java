package problem4;
import problem1.Student;
import java.util.Vector;
public class GradeBook {
    private Course course;
    private Vector<Student>  students;
    private Vector<Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        students=new Vector<>();
        grades=new Vector<>();
    }

    public void addStudent(Student s,int grade) {
        students.add(s);
        grades.add(grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to grade book for " + course);
    }

    public void displayGradeReport() {
        if (students.isEmpty()) return;

        int sum = 0;
        int max=grades.get(0);
        int min=grades.get(0);
        int maxIndex=0;
        int minIndex=0;
        for (int i=0;i<grades.size();i++) {
            int g = grades.get(i);
            sum += g;
            if (g>max){
                max=g;
                maxIndex=i;
            }
            if (g<min){
                min=g;
                minIndex=i;
            }
        }
        double avg = (double) sum / students.size();
        System.out.println("Average: " + avg);
        System.out.println("Highest grade is: " + max + "(" + students.get(maxIndex) + ")");
        System.out.println("Lowest grade is: " + min + "(" + students.get(minIndex) + ")");
    }
    public String toString(){
        return "GradeBook course="+course+",students count="+students.size();
    }
}
