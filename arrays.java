package com.company;

public class arrays {
    public static void main(String[] args) {
        int marks[]=new int[500];
        marks[0]=100;
        marks[1]=80;
        marks[2]=70;
       // marks[500]=20;->throws error because counting starts from 0
        System.out.println(marks[0]);
        int marksd[]={20,30,40,50,60};
        System.out.println(marksd[3]);
    }
}
