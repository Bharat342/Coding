package exception.user_define_exception.with_user_define_exception;

public class Bank  {
    void initiate() {
        ATM atm = new ATM();

        try {
            atm.accept_Input();
            atm.verify();
        }catch(Exception e) {
            try {
                atm.accept_Input();
                atm.verify();
            }catch(Exception f) {
                try {
                    atm.accept_Input();
                    atm.verify();
                }catch(Exception g) {
                    System.out.println("you bleedy your card is blocked now!");
                    System.exit(0);
                }
            }
        }
    }
}
