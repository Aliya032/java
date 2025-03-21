/*
Pranav goes to a shop to buy candles. the shopkeeper shows him candles of different brightness levels.
as Pranav hates light, he wants to buy a candle with the minimum brightness. but his wife instructed him not to do so.
no Pranav has to buy a candle which is just brighter than the minimum one.
logic -> second minimum
 */
/*
second minimum -> sort the array, then return the element at position 1.
 */
public class RightCandle {
    public static void main(String[] args) {
        int[] mybrightness = {1,2,5,6,7,8};
        System.out.println("Pranav has to choose the candle of brightness: " + getSecondBrightestCandle(mybrightness,6));
    }
    public static int getSecondBrightestCandle(int[] brightness, int totalCandles) {
        int temp;
        for (int i = 0; i<totalCandles; i++) {
            for (int j= i+1; j<totalCandles; j++) {
                if (brightness[i] > brightness[j]) {
                        temp = brightness[i];
                        brightness[i] = brightness[j];
                        brightness[j] = temp;
                }
            }
        }
        return brightness[1];
    }
}
