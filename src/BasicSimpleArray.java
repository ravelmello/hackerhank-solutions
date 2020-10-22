/**
 * Author: Ravel Mello
 * Created at: 19/10/2020
 */

public class BasicSimpleArray {

    static int simpleArraySum(int[] ar){
        int sum = 0;
        for(int i=0; i < ar.length; i++){
            sum = sum + ar[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 10,11};
        System.out.println(simpleArraySum(array));
    }
}
