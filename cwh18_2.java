package com.company;
import java.util.Scanner;
public class cwh18_2 {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc =new Scanner(System.in);
        int age;
        age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("You are an adult");
                break;
            case 25:
                System.out.println("You are eligible for jon");
                break;
            case 65:
                System.out.println("you should retire");
                break;
            default:
                System.out.println("Enjoy your life");
        }

    }
}
