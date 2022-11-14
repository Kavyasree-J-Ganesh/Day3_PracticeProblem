package com.bridgelabz;

public class ElementsInReverseOrder {
    static void reverseElements(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] p = {1,2,3,4,5,6};
        reverseElements(p);
    }
}
