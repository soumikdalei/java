package com.company;

public class cwhps8 {
    public static void main(String[] args) {
        int[]array={34,89,456,900,8500,9080 };boolean isShorted =true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isShorted=false;
                break;
            }
        }
        if(isShorted){
            System.out.println("Array is shorted");
        }
        else{
            System.out.println("Array is not shorted");
        }
    }
}
