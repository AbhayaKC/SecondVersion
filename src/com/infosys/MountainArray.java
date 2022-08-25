package com.infosys;

public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        //123 4 5 3 210000
        int start = 0;
        int end = arr.length -1;
        while(start < end){

            int mid = (start +end)/2;
            if(arr[mid] > arr[mid +1]){
                end = mid;
            }else{
                start = mid+1;
            }

        }
        return start;
    }
}
