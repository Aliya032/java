public class anotherWayToDeclareArrays {
    public static void main(String[] args) {
        int[] myarray = {1,2,3,4,5};
        int sum = 0;
/*
        for (int i = 0; i<myarray.length; i++) {
            System.out.print(myarray[i]+",");
        }
 */
        for (int i = 0; i<myarray.length; i++) {
            sum += myarray[i];
        }
        System.out.println("Sum of the given array: "+sum);
    }
}
