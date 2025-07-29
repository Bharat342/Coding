package collection_framework_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_ArrayList {
    private String studentName;
    private float studentPercentage;

    protected Student_ArrayList(String studentName, float studentPercentage) {
        this.studentName = studentName;
        this.studentPercentage = studentPercentage;
    }

    public String getStudentName() {
        return studentName;
    }

    public float getStudentPercentage() {
        return studentPercentage;
    }
}


class Driver {
    public static void main(String[] args) {

        List<Student_ArrayList> students = new ArrayList<Student_ArrayList>();

        students.add(new Student_ArrayList("Bharat", 30.53f));
        students.add(new Student_ArrayList("Sharada", 90.54f));
        students.add(new Student_ArrayList("Narendra", 60.23f));
        students.add(new Student_ArrayList("Rohan", 100.75f));

        // Here we are using lamdas expression
//        students.sort((o1, o2) -> (int) (o2.getStudentPercentage() - o1.getStudentPercentage()));

        // this one also same as the previous oneline lamdas expression one
        students.sort((a, b) ->{
            if(a.getStudentPercentage() - b.getStudentPercentage() > 0) {
                return 1;
            } else if(a.getStudentPercentage() - b.getStudentPercentage() < 0){
                return -1;
            } else {
                return 0;
            }
        });

        for(Student_ArrayList a : students) {
            System.out.println(a.getStudentName() + " : " + a.getStudentPercentage());
        }

        Scanner scan = new Scanner(System.in);

        scan.nextLine();
    }
}


