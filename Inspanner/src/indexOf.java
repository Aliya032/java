public class indexOf {
    public static void main(String[] args) {
        String s1 = "String handling in java";
        System.out.println("The string is: "+ s1);

        int index = s1.indexOf("in"); //3
        System.out.println("Pattern first found at: "+ index);

        index = s1.indexOf("in", 4); //12
        System.out.println("Pattern again found at: "+index);

        index = s1.lastIndexOf("in"); //16
        System.out.println("Pattern last found at: "+index);
    }
}
