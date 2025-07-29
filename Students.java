
import java.util.ArrayList;
import java.util.List;

public class Students {
    private int id;
    private String name;
    private int age;
    private String branch;

    public Students(int id, String name, int age, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }
}

class Start {
    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();

        students.add(new Students(54, "Bharat", 27, "java"));
        students.add(new Students(23, "Sharada", 23, "devops"));
        students.add(new Students(67, "Narendra", 15, "FullStack"));
        students.add(new Students(99, "Rohan", 29, "Python"));
        students.add(new Students(50, "Vipul", 18, "SpringBoot"));

        students.sort((o1, o2) -> (o1.getId() - o2.getId()));

        for(Students a : students) {
            System.out.println(a.getId() + " " + a.getName() + " " + a.getAge() + " " + a.getBranch());
        }

    }
}
