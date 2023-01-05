package com.company;
import java.util.Scanner;
public class cwh16_elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=sc.nextInt();
        if (a>56){
            System.out.println("You are experienced");
        }
        else if(a>36){
            System.out.println("You are semi experienced");
        }
        else if(a>26){
            System.out.println("You are semi semi experienced");
        }
        else{
            System.out.println("you are not experienced");
        }
    }
}
