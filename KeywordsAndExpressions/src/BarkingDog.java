public class BarkingDog {
    // write code here
    public static void main(String[] args) {
        shouldWakeUp (true, 1);
        shouldWakeUp (false, 2);
        shouldWakeUp (true, 8);
        shouldWakeUp (true, -1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay <0 || hourOfDay >23) {
                return false;
            } else if (hourOfDay <8 || hourOfDay >22){
                return true;
            }
        } else {
            System.out.println("dog is not barking.");
            return false;
        }
       return false;
    }
}
