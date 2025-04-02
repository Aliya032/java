/*
//upper case ASCII code lies between 65-90
//lower case ASCII code lies between 97-122

 */
public class UpperLowerCaseStrings {
    public static void main(String[] args) {
        String myString = "HeHeHeHe";
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int specialcaseCount = 0;
        for (int i = 0; i<myString.length();i++) {
            if (myString.charAt(i) >= 65 && myString.charAt(i) <=90) {
                uppercaseCount++;
            } else if (myString.charAt(i) >= 97 && myString.charAt(i) <=122) {
                lowercaseCount++;
            } specialcaseCount++;
        }
        System.out.println("lower case count: " + lowercaseCount + " uppercase count: " + uppercaseCount);
    }
}
