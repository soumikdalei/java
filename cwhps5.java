package com.company;

public class cwhps5 {
    public static void main(String[] args) {
        int [] marks= {56,78,90,89,98};
        int l= marks.length;
        int n=Math.floorDiv(l,2);int temp;
        for(int i=0;i<n;i++){
            temp=marks[i];
            marks[i]=marks[l-i-1];
            marks[l-i-1]=temp;
        }
        for(int element:marks){
            System.out.print(element);
            System.out.print(" ");
        }

    }
}
