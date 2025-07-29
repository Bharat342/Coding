package collection_framework_code;

// until I want I can give integer input to store
// when i want to quit giving input by entering anything except number
// then my program should show all the input which I have entered

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Code {

    boolean checkInput(String s) {
        try{
            int a = Integer.parseInt(s);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter the Numbers (Type anything except number to exit)");

        boolean input = true;

        ArrayList_Code d = new ArrayList_Code();
        while(input) {
            String temp = scan.next();
            if(d.checkInput(temp)) {
                list.add(Integer.parseInt(temp));
            } else {
                input = false;
            }
        }

        for(int i=0; i<list.size(); i++) {
            System.err.print(list.get(i) + " ");
        }

    }
}
