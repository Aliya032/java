public class ConvertingDigitsIntoWordsAndHandlingEdgeCases {
    public static void main(String[] args) {
        System.out.println(getDigitCount(100));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(00));
        System.out.println(reverse(123));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("Actual answer:");
        System.out.println("123-> ");
        numberToWords(123);
        System.out.println("1010-> ");
        numberToWords(1010);
        System.out.println("1000-> ");
        numberToWords(1000);
        System.out.println("-12-> ");
        numberToWords(-12);
        System.out.println("1132273 ->");
        numberToWords(1132273);
        System.out.println("900 -> ");
        numberToWords(900);
        System.out.println("0->");
        numberToWords(0);
        System.out.println(reverse(900));
        System.out.println(getDigitCount(900));
        System.out.println(getDigitCount(9));
        System.out.println(getDigitCount(900) - getDigitCount(9));

    }
    public static void numberToWords(int number) {
        int reverseNumber = reverse(number);
        int differenceOfZeroes = getDigitCount(number) - getDigitCount(reverseNumber);

        if (reverseNumber < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        while (reverseNumber != 0) {
                int remainder = reverseNumber % 10;

                switch(remainder) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("");
                        break;
                }
                reverseNumber /= 10;
            }


        while (differenceOfZeroes > 0) {
            System.out.println("Zero");
            differenceOfZeroes--;
        }

    }
    public static int reverse(int number) {
        int reverseNum = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverseNum = reverseNum*10 + remainder;
            number /= 10;
        }
        return reverseNum;
    }
    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number >0) {
            int remainder = number % 10;
            count++;
            number /= 10;
        }
        return count;
    }
}
