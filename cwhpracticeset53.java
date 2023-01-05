package com.company;
import java.util.Scanner;
public class cwhpracticeset53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.printf("%d x %d = %d\n",a,i,a*i);
        }

    }
}
