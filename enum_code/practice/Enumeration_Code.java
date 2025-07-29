package enum_code.practice;
/*
what is Enums :
    Enums is a Collection of Constants, Enums will give us lots of advantages over the ragular constants.
    Enums were introduced in java 5 which is realeased in 2004.
    In java, enum (short for "enumeration") is a special data type that represents a group of constants (unchangeable variables, like final variables).
    Enums are used when you have a fixed set of related values, such as days of the week, months of the year, states of a process,etc.
    They provide a way to define and use a collection of constants in a type-safe manner.
    -> In Case of Enums all we do is we give this a Collection of Constants and all the constants that we specify here should be relavent constant here.

    Creating Enums :
    -> 1. Whenever we create an enum ensure that enum has a group of constants which are related to each other.
    -> 2. Ensure that the Constants are given in a proper order.


 */

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

    // First Way
//public enum Enumeration_Code {
//    MINOR, MAJOR, CRITICAL
//}

    // Second Way
//    public enum Enumeration_Code {
////        MINOR(1), MAJOR(2), CRITICAL(5) // -> The moment we do this MINOR(1) so on we got an error because these internally going to make a call to constructor call automatically.
//
//        MINOR(1), MAJOR(2), CRITICAL(5);
//
//        private final int days; // -> when anything is private and final it cannot be access directly outside the class.
//        // and we want to access outside the class then it is only possiable through public getter method, when a method is public it can return its value.
//        Enumeration_Code(int days) { // -> now this will act like a setter (Automatically that 1 comes here from MINOR(1) and make a call to this setter)
//            this.days = days; // and this value will get stored into the days variable.
//        }
//
//        public int getDays() {
//            return days;
//        }
//    }

    // Third Way
    public enum Enumeration_Code {

        MINOR(1, "In Days"), MAJOR(2, "In Days"), CRITICAL(5, "In Days");

        private final int days;
        private final String message;
        Enumeration_Code(int days, String message) {
            this.days = days;
            this.message = message;
        }

        public int getDays() {
            return days;
        }

    public String getMessage() {
        return message;
    }
}