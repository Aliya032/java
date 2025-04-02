public class SmallestStringInAGivenString {
    public static void main(String args[])
    {
        String str="Hope all is well";
        String stringArray[]=str.split(" ");
        String word=stringArray[0];
        for(int i=1;i<stringArray.length;i++)
        {
            if(stringArray[i].length()<word.length())
                word=stringArray[i];
        }

        System.out.print(word);
    }
}
