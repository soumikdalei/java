package com.company;

public class cwh_31 {
   int logic(int x,int y){
        int z;
        if(x > y) {
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=4;
        int b=9;
        cwh_31 obj=new cwh_31();
        int c=obj.logic(a,b);
        System.out.println(c);
        int a1=56;
        int b1=9;
        int c1=obj.logic(a1,b1);
        System.out.println(c1);


    }
}
