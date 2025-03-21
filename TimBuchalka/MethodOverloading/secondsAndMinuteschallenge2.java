/*
in this, challenges we're going to create a method, that takes times, represented in seconds, as the parameter.
we'll then transform the seconds in to hours
next you'll display the time in hours with the remaining minutes and seconds in a string.
- we'll do this transformation in two steps, which allows us to use overloaded methods.
- create two methods with the same name: getDurationString
- the first method has one parameter of type int, named seconds
- the second method has two parameters, named minutes and seconds, both ints.
- both methods return a String in the format as shown: 'XXh YYm ZZs'
- where XX -> hours, YY -> minutes ZZ -> seconds
- the first method should in turn call the second method to return its result
- 1 min = 60 seconds
- 1 hour = 60 minutes or 3600 seconds
-Add validation to the methods as a bonus:
    - for the first method the seconds parameter should be >=0
    - for the second method the minutes parameter should be >=0, and the seconds parameter should be >=0 and <=59.
    - if either method is passed an invalid value print out some type of meaningful message to the user.
*/

public class secondsAndMinuteschallenge2 {
    public static void main(String[] args) {
        System.out.println("39450 seconds is: " + getDurationString(3945));
        System.out.println("65 minutes 45 seconds is: "+getDurationString(65,45));
    }
    public static String getDurationString(int seconds) {
        if (seconds >0) {
//            double hours = Math.floor(seconds/3600);
//            double minutes  = Math.floor((seconds%3600)/60);
/*
            //two-step approach to get hours
            int minutes = seconds /60;
            int hours = minutes/60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds %60;

            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
 */
            int minutes = seconds/60;
            return getDurationString(minutes,seconds);
        } else {
            return "Invalid value";
        }
    };
    public static String getDurationString(int minutes, int seconds) {
        if (minutes > 0 && (seconds >=0 && seconds <=59)) {
            int hours = minutes/60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds %60;

            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

        } else {
            return "Invalid values";
        }
    };
}
