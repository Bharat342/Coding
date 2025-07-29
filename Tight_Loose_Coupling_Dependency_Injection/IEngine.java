package Tight_Loose_Coupling_Dependency_Injection;

public interface IEngine {

    // incomplete method / abstract method
    int startEngine();

    // complete defalut method (To put complete method inside interface we use defalut keyword)
    public default void interfaceDefalutMethod() {
        System.out.println("defalut method inside interface...");
    }
}
