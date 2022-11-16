package com.bridgelabz;

import java.util.ArrayList;

public class FrequencyOfElement {
    static void frequencyOfElements(int[] arr){
        System.out.println("Duplicate elements are");
        ArrayList<Integer> arrli = new ArrayList<>();
        for(int i=0;i <arr.length-1; i++){
            int count = 1;
            if(!arrli.contains(arr[i])){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j] == arr[i]){
                        count++;
                    }
                }
                arrli.add(arr[i]);
                System.out.println("Frequency of " + arr[i] + " is " + count);
            }

        }


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,6,2};
        frequencyOfElements(arr);
    }
}


