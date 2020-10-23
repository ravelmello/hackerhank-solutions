import java.util.*;

/**
 * Author: Ravel Mello
 * Created at: 23/10/2020
 */

public class SalesByMatch {

    static int pairQuantity(int quantity, int[] arr){
        int sumOfPairs = 0;
        Set<Integer> ordened = new HashSet<>();

        for(int i = 0; i < quantity ; i++){
            if(!ordened.contains(arr[i])){
                ordened.add(arr[i]); //se não tem o nr da cor, adiciona
            } else {
                sumOfPairs++;
                ordened.remove(arr[i]); // se validou e já havia o nr da cor, ele incrementa o par, e retira o item da lista.
            }
        }


        return sumOfPairs;
    }

    public static void main(String[] args) {

        int[] arr = {10 ,20 ,20 ,10, 10, 30, 50, 10, 20 };

        System.out.println(pairQuantity(arr.length, arr));

    }
}
