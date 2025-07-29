package date_time;

import java.util.Calendar;
import java.util.Date;
//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static java.util.Calendar.YEAR;

/*
    -> The Older approach Before java 8 :
        Before java 8 we were using this date concept which come from the package 'java.util'(this is old one).
        -> there is one more way to deal with date which is belongs to 'java.sql' this also have a date.
    -> But in java 8 they introduced a new way to deal with date. (Now we are using 'java.time' package) which is a newer one to deal with date and time.
        form which package we are using the concept weather is a lagecy approach means (old approach) or it is java 8 approach (new approach)
    -> feature got added in java 8 this features was the 'java.time' package which is purely deal with date and time concepts.


    How its Work :
        -> When ever we write 'new Date()' actually it takes the complete date in mili seconds. let's see how does it calculate
        -> There is something called as 'epoch' What is epoch = In java, the term epoch refers to a fixed point in time used as a reference for measuring time.
            Specifically, it denotes 00:00:00: UTC on january 1, 1970, commonly known as the Unix epoch.
            Time values are often represented as the number of seconds or milliseconds that have elapsed since this epoch.

        (Allocates a Date object and initializes it to represent the specified number of milliseconds since the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
                Params: date – the milliseconds since January 1, 1970, 00:00:00 GMT.)
        -> Whenever we writeout new Date it actually calculate the time from January 1, 1970, 00:00:00 to the current date and time in milliseconds it will be storing the content.
            internally java is storing the date and time in milliseconds

        What is the difference Between 'java.util.Date' and 'java.sql.Date'
            -> 'java.util.Date' will print every thing like : Fri Jan 01 00:00:00 IST 2100
            -> 'java.sql.Date' will print only date like : 2100-01-01

 */

public class DateTime_Code {
    public static void main(String[] args) throws ParseException {
//        utilDateClass();
//        sqlDateClass();
//        formatDate();
        stringToDate();
    }

//    public static void utilDateClass() {
//        Date date = new Date(); // Creating an object of time 'Date' class from 'java.util.Date' package so that using that object ref.
//        // so that we can use all the methods present inside the Date class.
//        System.out.println(date); // Wed May 28 19:37:46 IST 2025
//        // but we are not storing the date and time is this format in our database this way
//        //sometimes we want to store only the year and date (exp : maybe I don't want to store the time) may be with different format I want to store the date and time in database.
//        // There is zone as well we are getting IST (Indian Standard Time) same way with different country the time Zone will vary.
//        // I don't want this format may be, I want only date or time or some different format. I want only certain parameters.
//        System.out.println(date.getTime()); // This method will calculate the date-time from jan 1 1970 to current date-time in milliseconds: 1748441266591
//
//        // add 1 day with the current date time means (24 hours) from current date-time
//        long currentDateTime = date.getTime();
//        Date futureDateTime = new Date(currentDateTime+86400000); // 86400000 -> its stands for 24 hours in milliseconds
//        // by adding with current we are getting 1day future date and time by current date-time
//        System.out.println(futureDateTime); // now we are printing the future date-time
//
//
//        // Now we are creating Object of type Date class and storing(year, month, date) in it.
//        Date date1 = new Date(200, 1, 1);
//        System.out.println(date1); // Mon Feb 01 00:00:00 IST 2100 (why it is giving 2100(it should 200) and why its giving feb(it should be jan not feb))
//
//       /*
//            -> What Happens in Month.
//            * System.out.println(date1); // Mon Feb 01 00:00:00 IST 2100 (why it is giving 2100(it should 200) and why its giving feb(it should be jan not feb))
//            * why because here the month is starts with 0('0' is considered as january) and like this '1' is considered as january.
//            * here we have a problem for exp: whenever the user type his month then we have to write a logic to give the program as right input
//            * if the date of month of the user is october and her typed 10 then it will be considered to be november then we have to write a login (10 - 1 = 9)
//            * then it will store as october why because the month counting getting start from 0 not from 1. ( 0 = january)
//
//            Params:
//                    year – the year minus 1900; must be 0 to 8099. (Note that 8099 is 9999 minus 1900.)
//                    month – 0 to 11
//                    day – 1 to 31
//
//            -> What Happens in Year
//            * Whatever year we are suppling while creating ojbect/ Calling constructor that year will get added with 1900 (we gave 200 + 1900 = 2100)
//            * That's why we got 2100 in year as output, For this also we have to write a logic so that it will input to the program according to out exception.
//            -> These all problem we will face when we go with java.util.Date package.
//        */
//    }

    public static void sqlDateClass() {
//        Date date = new Date(); // Why we are getting error here because its expecting arguments as year, month & date
         Date date = new Date(200, 1, 1); // -> now we gave all the arguments that's why the error gone.
        System.out.println(date); // output: -> Fri Jan 01 00:00:00 IST 2100 (using 'java.util.Date' this format of date and time is complex to read)
        // i dont want the time and zone, but it's still giving me all these things which is complex at readibility.
        // here if we use 'java.sql.Date then the output will be : 2100-01-01 (which is more readable compare to 'java.util.Date' class)'

        /*
            -> Now lets see how can we format the Date-Time (now lets see with java.sql.Date package.)
            -> if we notice the java.sql.Date class extends the 'java.util.Date' class
            -> which means even we are using java.sql.Date class what will happen is all the features of java.util.Date class is present here.
            -> all things are going to happens in same way like how 'epoch' works in java.util.Date that will work in here also.
         */
    }

    public static void formatDate() {

        Date date = new Date(124, 1, 1);
        System.out.println(date);

        SimpleDateFormat s = new SimpleDateFormat("yy-MMM-dd HH:mm:ss"); // Now here we can define the format in which we want to print the Date.
        // now we have an Object as 's' (What is this object does ?) what ever the format we mention while creating an object in that format the date will converted.
        // so in order to supply that further we will use a format() method
        String formatedDate = s.format(date); // it will store date in format : "yyyy-MM-dd" <'s' holds the format and 'date' holds the date>
        // it will not return back as a date object instead it will convert that into a string and return back to us.
        System.out.println(formatedDate);
        Date date1 = new Date(System.currentTimeMillis()); // this method will give us the current date-time
        System.out.println(date1); // printing the current date-time.

        /*
            Formating the Date-Time.
        SimpleDateFormat s = new SimpleDateFormat(""); // Now here we can define the format in which we want to print the Date.
            -> Here while giving the format we should take care of something:
                -> while giving year format every 'Y' should be in lower case not in upper case : yyyy
                -> when we're giving a month it should be in Uppercase : MM
                -> when we're giving a day it should be in lowercase : dd
                exp : SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd"); // Capital MM-> Represents 'months' and Small mm-> Represents 'minutes'
                -> if we want our date in 2100-Feb-01 the SimpleDateFormat("yyyy-MM-dd") will br "yyyy-MMM-dd"
                -> if we want the last 2 digit of year then 2024-Feb-01 then the format will be SimpleDateFormat("yy-MMM-dd")
                -> if we want time also then the format will be SimpleDateFormat("yy-MMM-dd HH:mm:ss")

         */
    }

    public static void stringToDate() throws ParseException {
        // now we will convert String formated date into a Date format
        Date date = new Date(125, 0, 1);
//        System.out.println(date);

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatedDate = s.format(date);
//        System.out.println(formatedDate);

        String demoDateTime = "2025-05-29"; // now we have to convert into String datatype into a Date.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = simpleDateFormat.parse(demoDateTime); // inside a SimpleDateFormat Class there is a method called 'SimpleDateFormat.parse()' which helps us to converts Strings data to a Date type object.
        // and this method may give us a checked exception 'ParseException' so it's good we can handle that. using throws keyword.
//        System.out.println(parsedDate); // but here is the problem is we got the same format which we don't want.
        // it makes the reprensentation of the details very complex to understand.

        // Then that's why they decided to came up with a new concept called "Calander" to overcome all these problems.

        calendarCode();
    }

    public static void calendarCode() {
        /*
            -> Calendar is actually an abstract class which implements Serializable, Cloneable, Comparable<Calendar> (it is comes from the page : java.util.Calendar)
                he Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields
                 such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
                 An instant in time can be represented by a millisecond value that is an offset from the Epoch, January 1, 1970 00:00:00.000 GMT (Gregorian).

            -> java.util.Calendar is an abstract class in Java that provides methods for working with dates and times.
                It is part of the java.util package and serves as a more flexible alternative to java.util.Date for performing date and time calculations,
                such as adding or substracting days, months, or years, and obtaining information like the day of the week or the month of the year.


            * So most of the people in the world they follow 'GregorianCalendar' as a standard Calendar *
               -> GregorianCalendar is a concrete subclass of the abstract Calendar class in java. It provides the implementation for the Fregorian Calendar system,
                    Which is the calendar system most commonly used in the world today the Gregorian calendar was introduced by Pope Gregory XIII in 1582 and
                    replaced the Julian calendar, correcting inaccuracies related to leap years and other calendar computations.

         */

//        Calendar calendar = Calendar.getInstance(); // it is an abstract class so that we can't create an object of an abstract class.
        // by using getIntstance() method we can create an object, actually internally it will not create an object of Calendar class instead
        // it will create of some other object which has some utility method and those utility methods which we can use it and do manupulation on date and time as we want.
        // and that object address we can give as : calendar

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime()); // it will fetch current date-time
        // But now in this output we only want year,month & day then how do we do that
        System.out.println(calendar.getWeekYear()); // it will give the current year

        // fetching current year using Enums.
        int year = calendar.get(calendar.YEAR);
            System.out.println("current year : "+ year); // '2025'

        // fetching current month
        int month = calendar.get(calendar.MONTH);
        System.out.println("current month : "+ month); // return '4' as (may) because months starts with 0

        // fetching current day
        int day = calendar.get(calendar.DATE);
        System.out.println("current day : "+ day); // return the current day '29'

        // fetching the days over till now of the current year
        int days = calendar.get(calendar.DAY_OF_YEAR);
        System.out.println("current day : "+ days); // return the number of days over '149' till now.

    }
}
