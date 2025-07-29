package interface_abstract;

public class Driver {
    public static void main(String[] args) {
        User1 user1 = new User1();
        User2 user2 = new User2();

        user1.payUsing();
        user2.payUsing();
    }
}
