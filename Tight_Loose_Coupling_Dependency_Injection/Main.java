package Tight_Loose_Coupling_Dependency_Injection;

public class Main {
    public static void main(String[] args) {

        // Creating Targer object and injection dependency using Constructor
        Car car = new Car(new DieselEngine()); // -> Constructor Injection

        // Creating target object
         Car car1 = new Car();
         // Injecting Dependent object into target through Setter method
         car1.setEngine(new DieselEngine()); // -> Setter Injection

        // if we're initialising the variable directly that is called Field Injection
        // injecting the dependent object into target class object Using target class variable is called as Field Injection.


        // Here we are calling drive() method
        car.drive();
    }
}
