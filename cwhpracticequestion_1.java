package com.company;

public class cwhpracticequestion_1 {
    static void multiplication(int a){
        for(int i=1;i<=10;i++){

            System.out.printf("%d * %d = %d\n",a,i,a*i);

        }
    }
    public static void main(String[] args) {
        System.out.println("The table is");
        multiplication(4);

    }
}
