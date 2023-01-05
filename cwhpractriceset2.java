package com.company;
import java.util.Scanner;
public class cwhpractriceset2 {
    public static void main(String[] args) {
        System.out.println("Enter your salary");
        Scanner sc=new Scanner(System.in);
        float a= sc.nextFloat();
        float tax=0.0f;
        if(a<=5.0f && a>2.5f){
            tax =tax+0.05f*(a-2.5f);
            System.out.println(tax);

        }
        else if(a>5.0f && a<=10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax= tax+0.2f*(a-5.0f);
            System.out.println(tax);
        }
        else if(a>10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.0f-5.0f);
            tax=tax+0.3f*(a-10.0f);
            System.out.println(tax);
        }
        else{
            tax=tax+0.0f;
            System.out.println(tax);

        }

    }
}
