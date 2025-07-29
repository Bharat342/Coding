package exception.propogate_moverment;

public class Demo2 {
    void fun2() {
        System.out.println("Connection Stablished Demo2..");
        try {
            Demo1 d1 = new Demo1();
            d1.fun1();
        }catch(Exception e) {
            System.out.println("Something Wrong happened!");
        }
        System.out.println("Connection Terminated Demo2..");
    }
}
