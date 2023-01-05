package com.company;
import java.util.Scanner;
public class cwhpracticeset56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();int i=1;int factorial=1;
        while(i<=a){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
    }

}
