//java program to find product of 3 numbers, read the numbers using cmd line arguments
class ProductThreeNumbersCmdArguments {
     public static void main(String a[]) {
         int num1 = Integer.parseInt(a[0]);
         int num2 = Integer.parseInt(a[1]);
         int num3 = Integer.parseInt(a[2]);
         int product = num1 * num2 * num3;
         System.out.println(product);
     }
}
