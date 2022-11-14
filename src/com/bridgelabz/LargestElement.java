package com.bridgelabz;

public class LargestElement {
    static void largestElementInArray(int[] arr){
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args){
        int[] a = {2,6,8,5,9,1,7};
        largestElementInArray(a);
    }
}
