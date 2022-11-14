package com.bridgelabz;

public class FrequencyOfElement {
    static void frequency(int[] arr, int element){
        int elementCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                elementCount++;
            }
        }
        System.out.println(elementCount);
    }
    public static void main(String[] args){
        int[] arr1 = {2,6,3,2,8,1,7,2,5};
        frequency(arr1, 2);
    }
}
