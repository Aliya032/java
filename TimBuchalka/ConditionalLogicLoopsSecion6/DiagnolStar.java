public class DiagnolStar {
    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println("8 stars");
        printSquareStar(8);
        printSquareStar(2);

    }

    public static void printSquareStar(int number) {
        if (number <5) {
            System.out.println("Invalid Value");
        } else {
            int i = 1;
            while (i <= number) {
                int j = 1;
                while (j <= number) {/*
            if (i == 1 ) {
                System.out.print("*");
            } else if (j == 1) {
                System.out.print("*");
            }else if (i == j) {
                System.out.print("");
            } else if (j == num && i <=j) {
                System.out.print("*");
            } else if (i == num) {
                System.out.print("*");
            } else if (j == (num - i + 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            j++;
        }
        i++;
        */
                    if ((i == 1 && i <= j) || (i == number && i >= j)) {
                        System.out.print("*");
                    } else if ((j == 1 && j <= i) || (j == number && j >= i)) {
                        System.out.print("*");
                    } else if (i == j) {
                        System.out.print("*");
                    } else if (j == number - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                }
                System.out.println("");
                i++;
            }
        }

    }
}
