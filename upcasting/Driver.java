package upcasting;

public class Driver extends A {
    @Override
    void test() {
        System.out.println("Inside Driver Class");
    }

    public static void main(String[] args) {
        A a = new B();
        a.test();

        a = new Driver();
        a.test();

    }
}
