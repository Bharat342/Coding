
class Animal {
    void breathe() {
        System.out.println("Animal is Breathing");
    }

    void eat() {
        System.out.println("Animal is Eating");
    }

    void foodHabbit() {
        System.out.println("Animal get food from Jungles");
    }
}

class Deer extends Animal {
    void eat() {
        // This is an OverRidden Method
        System.out.println("Deer Grazing and Eat");
    }

    void foodHabbit() {
        // This is an OverRidden Method
        System.out.println("Deers are Herbivores");
    }

    void foodSource() {
        // This is a specialised method
        // which is not inherited form the parent class
        System.out.println("Deer get food in glass area");
    }
}

class Tiger extends Animal {
    void eat() {
        // This is an OverRidden Method
        System.out.println("Tiger Hunt and Eat");
    }

    void foodHabbit() {
        // This is an OverRidden Method
        System.out.println("Tigers are carnivores");
    }

    void foodSource() {
        // This is a specialised method
        // which is not inherited form the parent class
        System.out.println("Tiger hunts in jungle for food");
    }
}

class Monkey extends Animal {
    void eat() {
        // This is an OverRidden Method
        System.out.println("Monkey generally steals and Eat");
    }

    void foodHabbit() {
        // This is an OverRidden Method
        System.out.println("Monkeys are omnivores");
    }

    void foodSource() {
        // This is a specialised method
        // which is not inherited form the parent class
        System.out.println("Monkeys are like humans they are " +
                " Generally found in tourist places for getting food");
    }
}

public class Methods_In_Inheritance {
    public static void main(String[] args) {
        Deer dr = new Deer();
        dr.breathe();
        dr.eat();
        dr.foodHabbit();
        dr.foodSource();

        System.out.println();
        Tiger tg = new Tiger();
        tg.breathe();
        tg.eat();
        tg.foodHabbit();
        tg.foodSource();

        System.out.println();
        Monkey mk = new Monkey();
        mk.breathe();
        mk.eat();
        mk.foodHabbit();
        mk.foodSource();
    }
}
