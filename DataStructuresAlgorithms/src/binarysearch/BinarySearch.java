package binarysearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int i, int j) {
        if(j <= i) {
            return nums[i] == target ? i : -1;
        }

        int mid = i + (j - i) / 2;
        return nums[mid] >= target ? search(nums, target, i , mid)
            : search(nums, target, mid + 1 , j);
    }
}
