package bank_mini_project;

public class UserDefineException extends Exception{
    @Override
    public String getMessage() {
        return "invalid input try again!";
    }

}
