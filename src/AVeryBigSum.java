/**
 * Author: Ravel Mello
 * Created at: 19/10/2020
 */

public class AVeryBigSum {

    static long aVeryBigSum(long[] ar){
        long sum = 0;
        for(int i = 0; i<ar.length ; i++){
            sum = sum + ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] ar ={1000000001, 1000000002, 1000000003, 1000000004, 1000000005  };

        long result = aVeryBigSum(ar);

       System.out.println("O valor é "+ result);

    }
}
