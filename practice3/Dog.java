package practice3;
public class Dog extends Animal {
    private String breed;
    public Dog() {
        super();
    }
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }
    public void eat(int amount) {
        System.out.println(name + " eats " + amount + " grams");
    }
    public void parentEat() {
        super.eat();
    }
    @Override
    public String toString() {
        return "Dog[" + super.toString() + ", breed=" + breed + "]";
    }
}

