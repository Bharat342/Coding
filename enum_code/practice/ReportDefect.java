package enum_code.practice;

public class ReportDefect {

    // -> First way without Enum
//    public static void main(String[] args) {
//        int days = Defect.getDefectFixingTime(0); // -> when we supply 0 to the method it take 0 and
//        // and go to that case and return the value according to that case.
//        /*
//            DrowBack :
//                1. But by looking at that 0 which we are passing as a argument without watching the defect class we can't tell what kind of defect it is.
//                2. Second drowback is if we supply 10 or something we can't see any error (we don't have any defect which represents value 10)
//                    if we now run by passing 10 then we have a defalut case which will throw an exception.
//                    -> Which will throw a runtime exception during runtime
//                    but throwing a checked exception is more meaningful so that during comiple time it should tell us that it is an invalid input.
//                    It should not let me code at all.
//                    -> 1st. But what happening here when we go with constants untill and unless I don't run the program I am not able to understand what is wrong.
//                    -> 2nd. There is no clarity (when we supply the number here there is no clarity what I am doing it)
//                    -> if we call the method with passing argument as 2 then we are getting 5 as output but what is 2 here we don't have that much of clarity
//                        so this is something which is difficult to understand.
//         */
//
//        System.out.println(days);
//    }

    // -> Second way with Enum
    public static void main(String[] args) {
//        int days = Defect.getDefectFixingTime(2); // -> now here the moment we are giving a wrong input we are getting an error.
//        int days = Defect.getDefectFixingTime(Enumeration_Code.MINOR); // Now this giving us a batter readibility.
//        System.out.println(days); // now we will get 1 which gives us more readibility.
        // now we can understand that the minor if we pass the number of days in ruturn we get as = 1
        // now if we want to give any other value except MINOR, MAJOR or CRITICAL it will give us error. it will not take input at all.
        // this is going to throw an exception during compile time only so that the user need not wait to run the program and see the exception
        // exception can be seen during wrong input is giving.
        // exp :
//            int days = Defect.getDefectFixingTime(Enumeration_Code.DUPLICATE); // There is nofield is ther called duplicate that's why it is giving us an error

        /*
        In Interview, they will ask what is the difference between using an enum and a constant ?
             When we can use Constants and tackle the situation why do you want to use enum in your project ?
                -> we are able to create more readibility when we store an information in database I need not store that information column as like 0 and 1
                    I can store it as 'MINOR', 'MAJOR' and 'CRITICAL' anybody looks at the database column they will have a more clarity looking at these values.

                    Now we can see how do we initialize a constant of enum !
                        -> first thing we need to understand object of enum cannot be created.
                        ->(We can create a Constructor inside an enum)
                        -> Enum Constructor are always private. (Why because enum object can never be created)
                        -> maintain the order in which we give the constants in your enum.

              Enum Methods:
                * values() : Returns an array of the enum constants in the order they are declared.
                * valueOf(String name) : Returns the enum constant with the specified name.
                * ordinal() : Returns the position of the enum constant (its index).
                * name() : Returns the name of the enum constant as a string.

              Advantages :
                * Type Safety: Enums provide vetter error checking by restricting the bvalues to the defined constants.
                * Code Readability: Enums improve the readability of your code by representing a fixed set of constants clearly.
                * Flexibility: Enums can have fields, methods, and constructors, making them powerful and flexible.
                * Switch Statements: Enums can be used in switch statements, which makes your code more organized and readable.

                Conclusion:
                    -> Enums are a useful feature in java when you need to represent a fixed set of related constants.
                        They provide many benefits, including type safety, code clarity, and flexibility.

         */

        Enumeration_Code s = Enumeration_Code.MAJOR; // -> in this line we didn't create an object of Enumeration_Code class
        // but internally one object getting so that we can create and access the constructor of that enum.
        // why because without an object constructor not getting called that is a rule in java, but we cannot create an object of enum. internally it's getting created automatically.

//        s.getDays(); // we are able to access a non-static method with 's' variable reference.
        // if object was not created how would i use 's' and access a getter method. (This is happening internally but we cannot do this.)

//        int days = s.getDays();
//        System.out.println("Total number of days to fix : " + days);

        int days = s.getDays();
        String message = s.getMessage();
        System.out.println(days + " " + message);
    }
}
