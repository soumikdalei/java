package com.company;

public class cwhpracticequestion_2 {
    static void stars(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        stars(5);

    }
}
