package com.infosys;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = { 4,5,6,7,0,1,2};
        System.out.println(highestIndex(nums));
    }

    static int highestIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;

            if (arr[mid] > arr[mid +1]){
            return mid;
            }
            if (arr[mid] > arr[start]){
             start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return end;
    }
    static int binarySearch(int [] nums, int target, int start, int end){

    }
}
