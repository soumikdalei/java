package com.company;
import java.util.Scanner;
public class cwhpracticesetarray2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num[] = {45, 56, 77, 87, 90};
        int num1 = sc.nextInt();
        boolean isAnarray = false;
        for (int element : num) {
            if (num1 == element) {
                isAnarray = true;
                break;
            }
        }
        if (isAnarray) {
            System.out.println("The value is present in array");

        }else{
            System.out.println("Not present");
        }
    }
}