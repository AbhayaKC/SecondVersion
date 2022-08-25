package com.infosys;

public class MinimumMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,1,4,5,6,7,3,4,2,2,1};


        System.out.println(minimumMountainRemovals(arr));
    }
    static int minimumMountainRemovals(int[] nums) {
        int whatever = 0;
        int solution = 0;
        int highestIndex = highestIndexInArray(nums);

        for (int i =0; i <highestIndex;i++){
            if (nums[i] >=nums[i+1]){
                solution++;
            }
        }

        for (int i = highestIndex; i <nums.length -1; i++){
            if (nums[i] <= nums[i+1]){
                solution++;
                nums[i+1] = nums[i];
            }
        }

        return solution;
        }
    static int highestIndexInArray(int [] nums){
        int highestNumber = 0;
        int highestIndex = 0;


        for (int i =0; i < nums.length; i++){
            if (nums[i] > highestNumber){
                highestNumber = nums[i];
                highestIndex = i;
            }
        }
        return highestIndex;
    }
}
