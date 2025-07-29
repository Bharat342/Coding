
class Plane1 {
    void takeOff() {
        System.out.println("Plance is taking off");
    }

    void fly() {
        System.out.println("Plance is flying");
    }

    void land() {
        System.out.println("Plance is landing");
    }
}

class CargoPlane1 extends Plane1 {
    void takeOff() {
        System.out.println("CargoPlane is taking off");
    }

    void fly() {
        System.out.println("CargoPlance is flying");
    }

    void land() {
        System.out.println("CargoPlance is landing");
    }
}

class PassengerPlane1 extends Plane1 {
    void takeOff() {
        System.out.println("PassengerPlane is taking off");
    }

    void fly() {
        System.out.println("PassengerPlance is flying");
    }

    void land() {
        System.out.println("PassengerPlance is landing");
    }
}

class FighterPlane1 extends Plane1 {
    void takeOff() {
        System.out.println("FighterPlane is taking off");
    }

    void fly() {
        System.out.println("FighterPlance is flying");
    }

    void land() {
        System.out.println("FighterPlance is landing");
    }
}

class AirPort {
    void permit(Plane1 ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

public class PolymorphismWithCodeFlexAndReduction {
    public static void main(String[] args) {
        CargoPlane1 cp = new CargoPlane1();
        PassengerPlane1 pp = new PassengerPlane1();
        FighterPlane1 fp = new FighterPlane1();

        AirPort a = new AirPort();
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
    }
}

















