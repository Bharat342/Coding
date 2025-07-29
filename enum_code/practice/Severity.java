package enum_code.practice;

public class Severity {
    final static int MINOR = 0; // -> the minor defect represent by 0
    final static int MAJOR = 1; // -> the major defect represent by 1
    final static int CRITICAL = 2; // -> the critical defect represent by 2
    final static int DUPLICATE = 3; // we added this line after using this class little bit
    // then to make work/run this line we need to complile this whole class file.
    // which is making the changes every time the compilation needs to take place completely.
    // so there are performance releted issues that we will notice here and the clarity of data will not be there
    // looking at this program we realy don't know that is this 1 2 3 (The Clarity of data is not there)
    // the information to be stored into the database if we store that as numeric values we might not understand looking at column in the database what this numeric values are all about.
}
