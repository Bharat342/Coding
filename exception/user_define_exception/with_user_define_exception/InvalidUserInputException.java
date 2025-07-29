package exception.user_define_exception.with_user_define_exception;

public class InvalidUserInputException extends Exception {
    public String getMessage() {
        return "invalid input try again!";
    }
}
