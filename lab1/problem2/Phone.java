package problem2;

public class Phone {
    enum Brand {APPLE,SAMSUNG,XIAOMI}
    static int totalPhones=0;
    final int serialNumber;
    String model;
    Brand brand;
    public Phone(String model,Brand brand,int serialNumber){
        this.model=model;
        this.brand=brand;
        this.serialNumber=serialNumber;
        totalPhones++;
    }
    public Phone(String model,int serialNumber){
        this(model,Brand.APPLE,serialNumber);
    }
    public String toString(){
        return brand+" "+ model + " SN: "+serialNumber;
    }
}
