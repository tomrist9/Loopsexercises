package exercise;

import java.util.Scanner;

public class CopyE {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 8, 9, 12};
        int k = 3;

        CopyE copyE = new CopyE(); // Create an instance to call the non-static method
        copyE.rotateElements(nums, k);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void rotateElements(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] result = new int[nums.length];

        // Copy the last k elements to the result array
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        // Copy the remaining elements to the result array
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[i - k];

        }

        // Copy the rotated array back to the original array
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
