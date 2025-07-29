package upcasting.instanceof_code;

public class C extends A {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a instanceof C);
    }
}
