package exception.propogate_moverment;

public class Demo3 {
    void fun3() {
        System.out.println("Connection Stablished in Demo3..");
        Demo2 d2 = new Demo2();
        d2.fun2();
        System.out.println("Connection Terminated in Demo3..");
    }
}
