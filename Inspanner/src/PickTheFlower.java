import java.util.Arrays;

/*
ananya loves flowers and today is her birthday. her bestfriend Ayushi wants to present her a bag of flowers.
the bag can contain only one type of flower. ayushi has a bunch of flowers in her garden, but due to the restriction of the bag, she can pick flowers of only one kind.
Aysushi is now confused which type of flowers to pick. so she decides to pick the flowers which are maximum
LOGIC -> consider flowers as characters ex a,a,b,b,b,b,b,b,c,c,,a,a she will choose flower b.
 */
public class PickTheFlower {
    public static void main(String[] args) {
        char[] inputFlowers = {'a','b','c','b','a','e'};
        int totalFlowers = inputFlowers.length;
        countingFlowers(inputFlowers,totalFlowers);
    }

    public static void countingFlowers(char[] flowers, int totalFlowers) {
        boolean visited[] = new boolean[totalFlowers];
        Arrays.fill(visited,false);
        for (int i  = 0; i<totalFlowers; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i+1; j <totalFlowers; j++) {
                if (flowers[i] == flowers[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(flowers[i] + " " + count);
        }
    }
}
