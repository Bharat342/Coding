import java.awt.desktop.SystemSleepEvent;

// Creating an Object of Charger which is supporting for mobile object
class Charger {
    private String brand;
    private int voltage;

    public Charger(String brand, int voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }

   public void setBrand(String brand) {
        this.brand = brand;
   }

   public String getBrand() {
        return brand;
   }

   public void setVoltage(int voltage) {
        this.voltage = voltage;
   }

   public int getVoltage() {
        return voltage;
   }
}

// Creating an Object of OS (Operatig System) which is supporting for mobile object
class OS {
    private String name;
    private int size;

    public OS(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

// Crating Mobile Object Which is the main object of the project
// charger is Aggregation to mobile (Loosely bound)
// OS is Composition to mobile (Tightly bound)
class Mobile {

    //Creating an Object inside a Mobile Object because OS is tightly bound(Composition) to Mobile.
    OS os = new OS("Android", 512);

    void hasACharger(Charger e) {
        System.out.println(e.getBrand());
        System.out.println(e.getVoltage());
    }
}

public class AggregationComposition {
    public static void main(String[] args) {

        Mobile m = new Mobile();

        Charger c = new Charger("oneplus", 5);

        System.out.println(m.os.getName());
        System.out.println(m.os.getSize());

        m.hasACharger(c);

        // m = null;
    }
}














