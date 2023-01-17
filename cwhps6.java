package com.company;

public class cwhps6 {
    public static void main(String[] args) {
        int array[]={34,78,90,89,90,79,98};int max=0;int min=Integer.MAX_VALUE;
        for(int e:array){
            if(e>max){
                max=e;
            }

        }
        System.out.println(max);
        for(int r:array){
            if(r<min){
                min =r;
            }
        }
        System.out.println(min);
    }
}
