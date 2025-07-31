import java.lang.reflect.Array;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

        List<Integer> add = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 33, 29, 12, 99, 32));

        Collections.sort(add);

        ArrayList<Integer> list = new ArrayList<Integer>(add);

        int n = 99;

        System.out.println(binarySearch(list, n));
    }

    public static boolean binarySearch(ArrayList<Integer> list, int n) {
        int low = 0, high = list.size();
        int steps = 0;

        int first = list.get(low);
        int last = list.get(high-1);
        while (low < high) {
            steps++;
            int mid = (low + high) / 2;

            if(list.get(mid) == n) {
                System.out.println("Steps "+ steps);
                return true;
            } else if(list.get(mid) < n) {
                low = mid +1;
            } else {
                high = mid;
            }
        }
        return false;
    }
}
