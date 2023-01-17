package com.company;

public class cwh_32_2 {

    static void foo(){
        System.out.println("Good morning bro");
    }
    static void foo(int a){
        System.out.println("Good morning "+a+" bro");
    }
    static void foo(int a,int b){
        System.out.println("Good morning "+a+" bro");
        System.out.println("Good morning "+b+" bro");

    }
    static int foo(int a, int b,int c){
        System.out.println("Good morning "+a+" bro");
        System.out.println("Good morning "+b+" bro");
        System.out.println("Good morning "+c+" bro");
        return 3;



    }


    public static void main(String[] args) {
        foo();
        foo(3000 );
        foo(300,678);
        foo(400,600,700);

    }
}
