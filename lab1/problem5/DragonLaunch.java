package problem5;
import java.util.Scanner;
import java.util.Vector;
public class DragonLaunch {
    private Vector<Person> people = new Vector<>();
    public void kidnap(Person p) {
        people.add(p);
    }
    public boolean willDragonEatOrNot() {
        int boys = 0;
        int girls = 0;

        for (Person p : people) {
            if (p.getGender() == Gender.B) boys++;
            else girls++;
        }
        return !(boys == girls);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DragonLaunch d = new DragonLaunch();

        System.out.print("How many people: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter gender (B or G): ");
            String g = sc.next();
            if (g.equalsIgnoreCase("B"))
                d.kidnap(new Person(Gender.B));
            else
                d.kidnap(new Person(Gender.G));
        }


        if (d.willDragonEatOrNot())
            System.out.println("Dragon will eat!");
        else
            System.out.println("No lunch for dragon");
    }
}
