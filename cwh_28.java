package com.company;

public class cwh_28 {
    public static void main(String[] args) {
        int [][]marks=new int[2][3];
        marks [0][0]=201;
        marks [0][1]=455;
        marks [0][2]=485;
        marks [1][0]=405;
        marks [1][1]=435;
        marks [1][2]=475;
        for(int i=0;i<marks.length;i++){
            for (int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
