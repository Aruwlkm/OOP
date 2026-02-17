package practice3;
public class AnTest {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        Dog d2 = new Dog("Rex", "Shepherd");

        d1.makeSound();        // overriding
        d2.makeSound();

        d2.eat();              // Animal method
        d2.eat("meat");        // overloading (Animal)
        d2.eat(300);           // overloading (Dog)

        d2.parentEat();        // super.eat()

        System.out.println(d2);
    }
}
