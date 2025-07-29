package Tight_Loose_Coupling_Dependency_Injection;

public class PetrolEngine implements IEngine{

    @Override
    public int startEngine() {
        System.out.println("Petrol Engine is Started...");
        return 1;
    }

    public void testingMethod() {
        System.out.println("Testing Method Petrol Class...");
    }
}
