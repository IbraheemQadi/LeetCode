import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++)
            nums[i] = scanner.nextInt();
        
        heapSort(nums);
        
        System.out.print('[');
        for(int i=0 ; i< length ; i++){
            System.out.print(nums[i]);
            if(i != length - 1)
                System.out.print(",");
            
        }    
         System.out.print(']');
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private static void heapify(int[] nums, int length, int i) {

        int left = i * 2 + 1;
        int right = left + 1;
        int largest = i;

        if (left < length && nums[left] > nums[largest])
            largest = left;
        if (right < length && nums[right] > nums[largest])
            largest = right;

        if (largest != i) {
            swap(nums, largest, i);
            heapify(nums, length, largest);
        }
    }

    private static void buildHeap(int[] nums) {
        int heapSize = nums.length;
        for (int i = heapSize / 2; i >= 0; i--) {
            heapify(nums, nums.length, i);
        }

    }

    public static void heapSort(int[] nums) {
        buildHeap(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            swap(nums, 0, i);
            heapify(nums, i, 0);
        }
    }
}
