package date_time;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

/*
        # java.time is the modern date and time API introduced in java 8 (JDK 8) as part of the "java.time" package.
            it as designed to replace the odfer java.util.Date and java.util.Calendar classes.
            Which had several issues related to time zone handling , thread safety, and clarity of design.
         -> The java.time API is built on the ISO-8601 standard and provides classes that model date and time concepts more clearly and safely.
         Advantage : I can get only date or only time or only zone etc...(we can work on only time, only date so on)
         -> LocalDate:
                    Represents a date without a time (year, month,day). It does not include time zone information.

    */
public class DateTime_Code2 {
        public static void main(String[] args) {

            // -> There is another method called as now()
//            localDateMethod();
//            localTimeMethod();
//            localZoneMethod();
//            localDateTimeMethod();

            // There is another method called as of()
//            localDateOfMethod();
//            localDateOfEpochDayMethod();
//            localTimeOfMethod();

            // -> DateFormatter
            dateTimeFormatterMethod();
        }

    // -> There is another method called as now()
        public static void localDateMethod() {
           LocalDate date =  LocalDate.now();// -> Here LocalDate is a class inside that there is method called now()
            // this line of code is going to give me the date
            System.out.println(date); // output : 2025-05-29 (format of this date is : yyy-MM-dd year, month, day
        }

        public static void localTimeMethod() {
            LocalTime time = LocalTime.now();
            System.out.println(time); // it will give us a current local time.(Format : Hours, Minutes, Seconds)
        }

    public static void localZoneMethod() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime); // it will give us current zone
    }

    public static void localDateTimeMethod() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // it will give both local date and time
    }

    // There is another method called as of()
        public static void localDateOfMethod() {
            LocalDate date = LocalDate.of(2025, 5, 29);
            System.out.println(date); // it will capture a specific year, month and day
        }

        public static void localDateOfEpochDayMethod() {
            LocalDate ofEpochDay = LocalDate.ofEpochDay(1000);
            System.out.println(ofEpochDay); // it is adding 1000 days to the epochday which is (1970-00-01)
            // after adding ofEpochDay(1000) we will get : 1972-09-27 as output
        }

        public static void localTimeOfMethod() {
            LocalTime time = LocalTime.of(10, 10, 31,12);
            System.out.println(time); // it will give us time in hour, minutes, second, nanoSecond
        }

        public static void dateTimeFormatterMethod() {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // this will create a object of that format
            // whatever object we give to this object methods it will give in that format only
            LocalDate date = LocalDate.now();
            System.out.println(dateTimeFormatter.format(date)); // format() method will format the based on that ofPattern() method and give the output.
            // output for this is : 29-05-2025 ("dd-MM-yyyy")
            System.out.println(date.format(dateTimeFormatter));

            /*
            System.out.println(dateTimeFormatter.format(date));
            System.out.println(date.format(dateTimeFormatter));
             -> this both will work same only
             */

            /*
                 * Period class represents a date-bases amount of time (e.g. years, months, days). It is used for measuring time between LocalDate objects.
                 *  Period period = Period.between(startDate, endDate);
             */

//            Period period = Period.between(startDate, endDate); // it expect start date and end date as arguments and it will give us output between those 2 data.

            String x = "1/1/2025";  // This is your date in String format

            // Define the format of the date string
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

            // Convert the string to a LocalDate
            LocalDate date5 = LocalDate.parse(x, formatter);

            // Print the date
            System.out.println("Parsed date: " + date5);

            /*
                📝 Notes:
                       -> "M/d/yyyy" matches single- or double-digit months and days (e.g., "1/1/2025", "12/25/2025").
                       -> LocalDate.parse() converts the string into a proper LocalDate object.
             */

        }
}
