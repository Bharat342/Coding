
class Employee {
    String name;
    float salary;

    Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println();
    }
}

class Manager extends Employee {
    private float bonus;
    Manager(String name, float salary, float bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void displaySalary() {
        System.out.println();
    }
}

public class InheritanceProject {
    public static void main(String[] args) {

    }
}
