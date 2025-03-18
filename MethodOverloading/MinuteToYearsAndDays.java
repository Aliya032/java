public class MinuteToYearsAndDays {
    public static void main(String[] args) {
        System.out.println(printYearsAndDays(525600));
        System.out.println(printYearsAndDays(1051200));
        System.out.println(printYearsAndDays(561600));
        System.out.println(printYearsAndDays(1440));
    }
    public static String printYearsAndDays(long minutes) {
        if (minutes < 0) {
            return ("Invalid Value");
        }
        long years = minutes / 525600;
//        long days = minutes % 525600;
        long remainingDays = ((minutes / 1440) % 365);
        return (minutes + " min = " + years + " y  and " + remainingDays + " d");
    }
}
