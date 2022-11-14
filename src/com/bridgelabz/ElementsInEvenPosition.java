package com.bridgelabz;

public class ElementsInEvenPosition {
    static void evenPosition(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] a = {1,8,4,6,3,9,2};
        evenPosition(a);
    }
}
