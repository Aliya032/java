public class summingOddNumbersInASpecificRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(10, 5));
    }
    public static boolean isOdd(int num) {
        if (num >0) {
            if (num%2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start >0 && end >0 && (start <= end)) {
            for (int i = start; i<=end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}
