package com.company;

public class cwhpracticesetarray3 {
    public static void main(String[] args) {
        float [] marks={70.2f,89.3f,56.5f,90.5f,78.3f};float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
         float avg=sum/marks.length;
        System.out.println(avg);
    }
}
