package Tight_Loose_Coupling_Dependency_Injection;

public class DieselEngine implements IEngine{
    @Override
    public int startEngine() {
        System.out.println("Diesel Engine is Started...");
        return 1;
    }

    public void testingMethod() {
        System.out.println("Testing Method Diesel Class...");
    }
}
