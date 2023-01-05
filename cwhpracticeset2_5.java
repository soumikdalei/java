package com.company;
import java.util.Scanner;
public class cwhpracticeset2_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a website");
        String web=sc.nextLine();
        if(web.endsWith(".com")){
            System.out.println("Website is a commercial website");
        }
        else if(web.endsWith(".org")){
            System.out.println("Website is organization website");
        }
        else if(web.endsWith(".in")){
            System.out.println("Website is Indian website ");
        }
        else{
            System.out.println("Website invalid");
        }
    }
}
