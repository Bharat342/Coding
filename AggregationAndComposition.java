
class Heart {
    private float weigth;
    private int bpm;

    public Heart(float weigth, int bpm) {
        this.weigth = weigth;
        this.bpm = bpm;
    }

    public float getWeigth() {
        return weigth;
    }

    public int getBpm() {
        return bpm;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }
}

class Brain {
    private float weight;
    private String color;

    public Brain(float weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Bike {
    private String brand;
    private float mileage;

    public Bike(String brand, float mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public float getMileage() {
        return mileage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }
}

class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Student {
    Heart h = new Heart(298f, 72);
    Brain b = new Brain(1400f, "Grayish Pink");

    void hasA(Bike bi) {
        System.out.println(bi.getBrand());
        System.out.println(bi.getMileage());
    }

    void hasA(Book bo) {
        System.out.println(bo.getName());
        System.out.println(bo.getAuthor());
    }
}

public class AggregationAndComposition {
    public static void main(String[] args) {

        // giving Reference
        Student s = new Student();
        Bike bike = new Bike("Honda", 20.00f);
        Book book = new Book("java", "James Gosling");

        // Accessing Heart object using student object Which is Composition(Tightly Bound) with student
        System.out.println(s.h.getWeigth());
        System.out.println(s.h.getBpm());

        // Accessing brain object using student object Which is Composition(Tightly Bound) with student
        System.out.println(s.b.getWeight());
        System.out.println(s.b.getColor());

        //Accessing Bike and Book object using Student object  Which is Aggregation(Loosely Bound) with student
        s.hasA(bike);
        s.hasA(book);

        //by making 's' to "null" we are deleting the student object which will delete the heart and brain object too
        // Because the heart and brain is composition to the student object
        s = null; // Taking Reference Back
    }
}

