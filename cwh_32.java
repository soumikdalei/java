package com.company;
public class cwh_32 {
    static void telljoke(){
        System.out.println("Say good morning");
    }
    static void change1(int a1){
        a1=45;
    }
    static void change2(int[] a){
        a[0]=34;

    }
    public static void main(String[] args) {
        telljoke();
        int b1=56;
        change1(b1);
        System.out.println(b1);
        int [] b={45,56,78,90};
        change2(b);
        System.out.println(b[0]);


    }
}
