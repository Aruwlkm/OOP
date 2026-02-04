package problem3;
public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(14, 30, 45);
        Time t2 = new Time(2, 40, 30);

        System.out.println("Universal time:");
        System.out.println(t1.toUniversal());
        System.out.println("Standard time:");
        System.out.println(t1.toStandard());
        Time t3 = t1.add(t2);
        System.out.println("Sum time:");
        System.out.println(t3.toUniversal());
    }
}
