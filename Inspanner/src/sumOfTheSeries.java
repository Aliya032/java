//sum of the series: 1 + 1/2 + 1/3 + 1/4 + 1/5
public class sumOfTheSeries {
    public static void main(String[] args) {
        float i = 1;
        float j = 1;
        float sum = 0;
        while (i<=5) {
            sum += (j/i);
            i++;
        }
        System.out.println(sum);

    }
}
