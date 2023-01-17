package com.company;

public class cwh_33 {
    static int sum1(int...a){
        int sum1=0;
        for(int e:a){
            sum1+=e;
        }
        return sum1;

    }
    static int sum(int x,int...arr){
        int sum=x;
        for(int element:arr)
        {
              sum+=element;
          }return sum;
    }


    public static void main(String[] args) {
        System.out.println("The sum is "+sum(2,3,4,8,9));
        System.out.println("The sum is "+sum(4));
        System.out.println("The sum is "+sum1());

    }
}
