package enum_code.practice;

public class Defect {
//    public static int getDefectFixingTime(int severity) { // -> with first and second way
        // -> Without enum 1st way
//        return switch(severity) {
//            case 0->1; // -> if the input we get 1 then it will return 1
//            case 1->3;
//            case 2->5;
//            default -> throw new IllegalArgumentException("Unexcepted value");
//        };


        // -> Without enum 2nd way
//        return switch(severity) {
//            case Severity.MINOR->1; // -> if the input we get 1 then it will return 1
//            case Severity.MAJOR->3; // (what this line does: Whenever we call this line it will give us as return with a numeric value)
//            case Severity.CRITICAL->5;
//            default -> throw new IllegalArgumentException("Unexcepted value");
//        };
//    }



    public static int getDefectFixingTime(Enumeration_Code s) {
        // -> With enum
        return switch(s) {
            case MINOR->1;
            case MAJOR->3;
            case CRITICAL->5;
        };
    }
}

