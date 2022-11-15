package com.bridgelabz;

public class ArraySortingInAscendingOrder {
    static int[] sortArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr2 = {5,4,2,3,1,9,7};
        int[] arr3 = sortArray(arr2);
        for(int k=0; k<arr3.length; k++){
            System.out.println(arr3[k]);
        }

    }
}
