package exercise;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.print("Original array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        rotateArray.rotate(nums, k);
    }


    public void rotate(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;

        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);

        System.out.print("Rotated array: ");
        for (int num : nums) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }
}
