import java.math.BigInteger;
import java.util.*;

public class SlidingWindowMedian {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,-1,-3,5,3,6,7);
        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();
        int size = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, size)));
    }

    private static double[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] result = new double[n - k + 1];

        // Max heap (lado esquerdo, invertido)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(nums[b], nums[a]) != 0 ? Integer.compare(nums[b], nums[a]) : Integer.compare(b, a));

        // Min heap (lado direito)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(nums[a], nums[b]) != 0 ? Integer.compare(nums[a], nums[b]) : Integer.compare(a, b));

        for (int i = 0; i < n; i++) {
            // Inserção nova
            if (maxHeap.isEmpty() || nums[i] <= nums[maxHeap.peek()]) {
                maxHeap.offer(i);
            } else {
                minHeap.offer(i);
            }

            // Rebalancear
            balance(maxHeap, minHeap);

            // Remover elementos fora da janela
            if (i >= k) {
                int out = i - k;
                if (maxHeap.contains(out)) {
                    maxHeap.remove(out);
                } else {
                    minHeap.remove(out);
                }
                balance(maxHeap, minHeap);
            }

            // Se janela cheia, calcula mediana
            if (i >= k - 1) {
                if (k % 2 == 0) {
                    result[i - k + 1] = ((double) nums[maxHeap.peek()] + nums[minHeap.peek()]) / 2.0;
                } else {
                    result[i - k + 1] = nums[maxHeap.peek()];
                }
            }
        }

        return result;
    }

    private static void balance(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        // manter heaps balanceadas
        while (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        }

        while (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
}
