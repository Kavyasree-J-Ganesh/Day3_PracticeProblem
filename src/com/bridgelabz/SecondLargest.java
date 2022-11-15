package com.bridgelabz;

public class SecondLargest {
    static void findSecondLargest(int[] arr){
        int largest = 0;
        int secondLargest = 0;
        if(arr[0] > arr[1]){
            largest = arr[0];
            secondLargest = arr[1];
        }else{
            largest = arr[1];
            secondLargest = arr[0];
        }
        for(int i=2; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
    public static void main(String[] args) {
        int[] arr1 = {4,1,6,2,9,3};
        findSecondLargest(arr1);
    }
}
