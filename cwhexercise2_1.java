package com.company;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.util.Random;

public class cwhexercise2_1 {

            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                Random r=new Random();
                System.out.println("enter comp choice");
                int a=r.nextInt(1,3);
                System.out.println("enter your choice 1 for rock 2 for paper and 3 for scissor" );
                int b=sc.nextInt();


                if(a==b){
                    System.out.println("Match draw");

                }
                else if(a==1&&b==2){
                    System.out.println("you won");
                }
                else if(a==2&&b==1){
                    System.out.println("computer won");
                }
                else if(a==2&&b==3){
                    System.out.println("computer won");
                }
                else if(a==3&&b==2){
                    System.out.println("you won");
                }
                else if(a==1&&b==3){
                    System.out.println("computer won");
                }
                else if(a==3&&b==1){
                    System.out.println("you won");
                }

            }
        }


