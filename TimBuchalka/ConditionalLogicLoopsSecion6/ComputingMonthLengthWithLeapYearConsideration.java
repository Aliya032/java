/*
There are 7 months that have 31 days and they can be listed as January 1, March 3, May 5, July 7, August 8, October 10, and December 12.
- There are 4 months that have 30 days and they can be listed as April 4 , June 6, September 9, and November 11.
 */
public class ComputingMonthLengthWithLeapYearConsideration {
    public static void main(String[] args) {
//        System.out.println(isLeapYear(1700));
//        System.out.println(isLeapYear(1800));
//        System.out.println(isLeapYear(1900));
//        System.out.println(isLeapYear(2100));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2000));
//        System.out.println(isLeapYear(2000));
//        System.out.println(isLeapYear(2400));
//        System.out.println(isLeapYear(-1600));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
    public static boolean isLeapYear(int year) {
        if (year <1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        int days;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999) ) {
            return -1;
        }
        if (isLeapYear(year)) {
            days = switch (month) {
                case 1 -> 31;
                case 2 -> 29;
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default -> -1;
            };
        } else {
            days = switch (month) {
                case 1 -> 31;
                case 2 -> 28;
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default -> -1;
            };
        }
        return days;
    }

}
