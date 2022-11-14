package com.bridgelabz;

public class SmallestElement {
    static int smallestElementInArray(int[] arr) {
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
        public static void main(String[] args){
            int[] a = {3,9,4,1,8,2,7};
            int small = smallestElementInArray(a);
            System.out.println(small);
    }
    }


