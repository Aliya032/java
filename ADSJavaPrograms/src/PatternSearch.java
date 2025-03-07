// implementing Naive Search algorithm in Java
public class PatternSearch {

    public static void search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        // A loop to slide pat[] one by one
        for (int i = 0; i <= N - M; i++) {
            int j;

            // For current index i, check for pattern match
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            // If pattern matches at index i
            if (j == M) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        String txt1 = "WEGOINGCRAZYWEGOINGCRAZY";
        String pat1 = "CRAZY";
        System.out.println("Example 1:");
        search(pat1, txt1);


        // Example 2
        String txt2 = "HOWAREYOUHOWAREYOU";
        String pat2 = "ARE";
        System.out.println("\nExample 2:");
        search(pat2, txt2);

        // Example 3
        String txt3 = "AABGRSTKS";
        String pat3 = "GRS";
        System.out.println("\nExample 3:");
        search(pat2, txt2);
    }
}