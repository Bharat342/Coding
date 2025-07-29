

abstract class Bird {
    abstract void eat();
    abstract void fly();
}

abstract class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle Fly at Great Height");
    }
}

class SerpentEagle extends Eagle {
    void eat() {
        System.out.println("Serpent Eagle hunts Snakes and Eat");
    }
}

class GoldenEagle extends Eagle {
    void eat() {
        System.out.println("Golden Eagle Flys over the sea and Eats Fish");
    }
}

class AnimalBird {
    void permit(Eagle ref) {
        ref.eat();
        ref.fly();
    }
}

public class AbstractionProgram_Bird {
    public static void main(String[] args) {
        SerpentEagle se = new SerpentEagle();
        GoldenEagle ge = new GoldenEagle();

        AnimalBird ab = new AnimalBird();

        ab.permit(se);
        ab.permit(ge);
    }
}
