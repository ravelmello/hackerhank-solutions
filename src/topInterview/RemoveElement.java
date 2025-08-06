package topInterview;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {

    public static void main(String[] args) {
        int val = 3;
        int[] arr = {3,2,2,3};

        System.out.println(Arrays.toString(removeElement(arr, val)));
    }

    private static int[] removeElement(int[] arr, int val) {

        int left = 0;
        int right = arr.length - 1;
        int counter =0;

        while(counter < arr.length){
          if(arr[left] == val){
              arr[left] = arr[right];
              arr[right] = val;
              right--;
          } else {
              left++;
          }
          counter++;
        }

        return Arrays.copyOf(arr, left);
    }
}
