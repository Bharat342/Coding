package student_management_system;

public class Student_Management {
    private String studenName;
    private int id;
    private String course;

    public Student_Management() {

    }

    public Student_Management(String studenName, int id, String course) {
        this.studenName = studenName;
        this.id = id;
        this.course = course;
    }

    public String getStudenName() {
        return studenName;
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public void setStudenName(String studenName) {
        this.studenName = studenName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    void enrollCourse() {

    }

    void dispStudentDetails() {
        System.out.println("Name :" + getStudenName() + ", id :"+ getId() + ", course :" + getCourse());
    }



}
