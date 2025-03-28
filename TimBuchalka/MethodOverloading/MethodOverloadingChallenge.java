/*
inches to centimeters 1 inch = 2.54 cm
one foot = 12 inches
create two methods with same name: convertToCentimeters.
- the first method has one parameter of type int, which represents the entire height in inches. you'll convert inches to centimeters, in this method, and pass back the number of centimeters as a double
- the second method has two parameters of type int, one to represent height in feet, and one to represent the remaining height in inches. so if a person is 5 foot, 8 inches the values 5 for feet and 8 for inches would be passed to this method. this method will convert feet and inches to just inches, then call the first method, to get the number of centimeters, also returning the value as a double.
 */
public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }
    public static double convertToCentimeters(int heightInches){
        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        //return convertToCentimeters((feet*12) + inches);
        int feetToInches = feet *12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
