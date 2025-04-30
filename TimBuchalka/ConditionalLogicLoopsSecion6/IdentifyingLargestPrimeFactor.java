public class IdentifyingLargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
    }
    public static int getLargestPrime(int num) {
        if (num < 0 || num == 0 || num == 1) {
            return -1;
        }
        int result = -1;
        for (int i = 1; i<= num; i++) {
            if (num %i == 0) {
                if (i > result) {
                    int count = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i%j == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        result = i;
                    }
                }
            }
        }
        return result;
    }
}
