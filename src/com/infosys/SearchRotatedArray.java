package com.infosys;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7, 8 , 10, 0,1,2};
        System.out.println(highestIndex(nums));
    }
    static int search(int[] nums, int target) {
        int answer = -1;
        return 0;
    }



    static int highestIndex(int[] nums){
        int start =0;
        int end = nums.length -1;

        while(start < end) {
            int mid = (start+end)/2;
            if (nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1] ){
                return mid;
            }
            if(nums[mid] > nums[mid +1]){
                end = mid;
            }else{
                start = mid;
            }
        }
        return start;

    }

    static  int leftSearch(int [] nums){
        return 0;
    }
}
