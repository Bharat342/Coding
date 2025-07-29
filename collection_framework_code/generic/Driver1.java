package collection_framework_code.generic;

public class Driver1 {
    public static void main(String[] args) {
        Generic_Code1<String, Integer> generic = new Generic_Code1<>("Bharat", 1);
        System.out.println(generic.getId());
        System.out.println(generic.getName());
    }
}
