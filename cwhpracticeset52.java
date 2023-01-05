package com.company;
import java.util.Scanner;
public class cwhpracticeset52 {
    public static void main(String[] args) {Scanner sc=new Scanner(System.in);
        int sum=0;int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sum=sum+(2*i);
        }
        System.out.println("The sum of even nos :");
        System.out.println(sum);
    }
}
