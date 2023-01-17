package com.company;

public class cwh_27_2 {
    public static void main(String[] args) {
        int marks[]={89,78,98,97,79,68,56};
        for(int i =marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        for(int element:marks){
            System.out.println(element);
        }
    }
}
