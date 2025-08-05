package topInterview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int m = 6;
        int[] nums2 = {1,2,2};
        int n = 3;

       // merge(nums1, m, nums2, n);
        mergeUsingPointer(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int position = 0;
        for(int i = nums1.length - 1; i >= 0; i--) {
            if(nums1[i] == 0 && i > m - 1 ) {
               nums1[i] = nums2[position];
               position++;
            }
        }

        Arrays.sort(nums1);

    }

    private static void mergeUsingPointer(int[] nums1, int m, int[] nums2, int n){

        if(n == 0) return ;

        int end_idx = m + n - 1;

        while (n > 0 && m > 0) {
            if(nums2[n-1] >= nums1[m-1]) {
                nums1[end_idx] = nums2[n-1];
                n--;
            } else {
                nums1[end_idx] = nums1[m-1];
                m--;
            }
            end_idx--;
        }

        while(n > 0) {
            nums1[end_idx] = nums2[n-1];
            n--;
            end_idx--;
        }

    }
}
