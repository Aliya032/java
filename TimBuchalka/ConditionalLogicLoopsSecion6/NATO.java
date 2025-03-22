/*
in this challenge we'll be using the NATO alphabet to replace a character or letter, with NATO's standardized word for that letter.

- in radio transmissions, the word car, "C","A", "R" would be read, "Charlie Able Roger" for clarity.
- we'll take a single character, and return the matching word from the NATO phonetic alphabet, shown on this slide.
A = Able,
B = Baker,
C= Charlie,
D = Dog,
E = Easy,
F = Fox,
G  = Gorge,
H = How,
I = Item,
J = Jig,
K = King
L = Love
M = Mike,
N = Nan,
O = Oboe
P = Peter
Q = Queen
R = Roger,
S = Sugar,
T = Tare,
U = Uncle,
V = Victor,
W = William, X = X-ray, Y = Yoke, Z = Zebra

- Do this:
    - create a new char variable
    - use the traditional switch statement (with a colon in case labels) that test the value in the variable from step 1.
    - create cases for the characters A,B,C,D and E
    - display a message in each case block, with the letter and the NATO word, then break
    - add a default block, which displays the letter with a message saying not found.
 */
public class NATO {
    public static void main(String[] args) {
        char charValue = 'X';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
                break;
        }
    }
}
