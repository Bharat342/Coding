package Tight_Loose_Coupling_Dependency_Injection;

public class Car {
    public static void main(String[] args) {

        // we are doing upcasting here
        IEngine engine = new PetrolEngine();
        engine.startEngine();
        engine.interfaceDefalutMethod();

        // we are doing down casting here to access parent ref to child specialised method
        // otherwise it will give InvalidCastException during runtime
        /*
        PetrolEngine petrolEngine = (PetrolEngine) engine;
        petrolEngine.testingMethod();
         */

        PetrolEngine petrolEngine = new PetrolEngine();
        petrolEngine.testingMethod();

        DieselEngine dieselEngine = new DieselEngine();
        dieselEngine.testingMethod();
    }

   private IEngine engine;

    // if we're initialising the variable directly that is called Field Injection
    // injecting the dependent object into target class object Using target class variable is called as Field Injection.

   // 0 parameterised constructor
   public Car() {

   }

   // Injecting Dependency using Constructor (Constructor Injection)
   public Car(IEngine engine) {
       this.engine = engine;
   }

    // Injecting Dependency using Setter Method (Setter Injection)
   public void setEngine(IEngine engine) {
       this.engine = engine;
   }
   public void drive() {
       int status = engine.startEngine();

//       if(status >= 1) {
//           System.out.println("Engine is started..");
//       } else {
//           System.out.println("Engine is Failed to start...");
//       }
   }

}
