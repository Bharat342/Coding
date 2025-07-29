
import java.util.Scanner;

abstract class Shape {
    float area;

    abstract void acceptInput();
    abstract void calcArea();

    void dispArea() {
        System.out.println(area);
    }
}

class Square extends Shape {
    float side;

    void acceptInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Side of Square : ");
        side = scan.nextFloat();
    }

    void calcArea() {
        area = side * side;
    }
}

class Rectangle extends Shape {
    float length;
    float breadth;

    void acceptInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of Rectangle : ");
        length = scan.nextFloat();

        System.out.println("Enter the breadth of Rectangle : ");
        breadth = scan.nextFloat();

    }

    void calcArea() {
        area = length * breadth;
    }
}

class Circle extends Shape {
    float radius;

    void acceptInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of Circle : ");
        radius = scan.nextFloat();
    }

    void calcArea() {
        area = 3.141f * radius * radius;
    }
}

class Geometry {
    void permit(Shape ref) {
        ref.acceptInput();
        ref.calcArea();
        ref.dispArea();
    }
}

class AreaProgram {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Geometry g = new Geometry();

        g.permit(s);
        g.permit(r);
        g.permit(c);
    }
}