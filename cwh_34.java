package com.company;

public class cwh_34 {
    static int factorial(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a=a*factorial(a-1);
        }
    }
    static int factorial1(int a){
        if(a==0||a==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i = 1; i <= a; i++) {
                product *= i;

            }
            return product;
        }
    }
    public static void main(String[] args) {
        int a=9;
        System.out.println("The factorial "+factorial(a));
        System.out.println("The factorial "+factorial1(a));

    }
}
