package com.bridgelabz;

public class ElementsInOddPosition {
    static void oddPosition(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] a = {5,7,4,3,9,8,1,6};
        oddPosition(a);

    }
}
