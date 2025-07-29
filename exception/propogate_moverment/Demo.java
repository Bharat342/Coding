package exception.propogate_moverment;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Connection Stablished in main class..");
        Demo3 d3 = new Demo3();
        d3.fun3();
        System.out.println("Connection Terminated in main class..");

        //if the method doesn't handeled the exception and propogate to its caller
        // then if the caller will handled the exception then statements below the place where exception generated
        //will not get executed.
    }
}
