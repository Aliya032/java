public class WhileLoopChallenge {
    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0);
    };

    public static void main(String[] args) {
        int number = 4;
        int oddCount = 0;
        int evenCount = 0;
        while (number <= 20) {
            number++;
            if (!isEvenNumber(number)){
                oddCount++;
                continue;
            }

            System.out.println(number);
            evenCount++;

            if (evenCount >=5) {
                break;
            }
        }
        System.out.println("Odd count: "+oddCount);
        System.out.println("even count: "+evenCount);
        System.out.println(isEvenNumber(45));
    }
}
