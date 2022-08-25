package leetcode;

import java.util.Arrays;

public class FirstLastInArray {
    public static void main(String[] args) {
        int[] nums = {1};

        int target = 1;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int first = firstNum(nums, target, true);
        int second = firstNum(nums, target, false);


        if (first == -1 && second == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{first,second};

    }

    static int firstNum(int[] nums, int target, boolean numFirst) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                if (numFirst) {
                    result = mid;
                    end = mid - 1;
                } else {
                    result = mid;
                    start = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

}




