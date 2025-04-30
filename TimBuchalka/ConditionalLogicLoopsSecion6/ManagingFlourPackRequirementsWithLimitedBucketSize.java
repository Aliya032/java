public class ManagingFlourPackRequirementsWithLimitedBucketSize {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 11));
        System.out.println(canPack(2, 1, 5));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int big_weight = 5;
        boolean result = false;
        int totalBigWeight = bigCount * big_weight;
        if (totalBigWeight >= goal) {
            int remaining = goal % big_weight;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
                if (smallCount >= goal - totalBigWeight) {
                    result = true;
                }
            }

        return result;

    }
}
