import java.util.Arrays;
import java.util.stream.IntStream;

public class CountByX {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(CountByX.countBy(50, 5)));
        System.out.println(Arrays.toString(CountByX.countBetter(50, 5)));
    }
    static int[] countBy(int x, int n){
        int multiples[] = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
          sum = sum + x;
          multiples[i] = sum;
        }
        return multiples;
    }



    static int[] countBetter(int x, int n) {
        return IntStream.rangeClosed(1, n).map(i->i*x).toArray();
    }
}
