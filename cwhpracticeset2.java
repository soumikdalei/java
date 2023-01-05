package com.company;
import java.util.Scanner;
public class cwhpracticeset2 {
    public static void main(String[] args) {
        //question 2
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks for subject a");
        float a=sc.nextFloat();
        System.out.println("Enter marks for subject b");
        float b=sc.nextFloat();
        System.out.println("Enter marks for subject c");
        float c=sc.nextFloat();
        float total=a+b+c;

        float percentage=(total/300)*100;
        System.out.println(percentage);
        if(percentage>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("You are passed");
        }
        else{
            System.out.println("You are fail");
        }
    }
}
