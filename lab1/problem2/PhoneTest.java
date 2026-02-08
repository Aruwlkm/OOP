package problem2;
public class PhoneTest {
    public static void main(String[] args){
        Phone p1=new Phone("iphone14", Phone.Brand.APPLE,111);
        Phone p2=new Phone("Redmi", Phone.Brand.XIAOMI,222);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Total phones: "+ Phone.totalPhones);
    }
}
