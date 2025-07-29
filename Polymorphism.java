
class Plane{
    void fly() {
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane{
    void fly() {
        System.out.println("Cargo Plane is flying at Low Height");
    }
}

class PassengerPlane extends Plane{
    void fly() {
        System.out.println("Passenger Plane is flying at Medium Height");
    }
}

class FighterPlane extends Plane{
    void fly() {
        System.out.println("Fighter Plane is flying at Great Height");
    }
}


public class Polymorphism {
    public static void main(String args[]) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        cp.fly();
        pp.fly();
        fp.fly();
    }
}
