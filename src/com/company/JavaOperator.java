package com.company;

public class JavaOperator {
    public static void main(String args[]){
        /*int x=10;// unary operator ++ and __
        System.out.println(x++);//10(11)
        System.out.println(++x);//12
        System.out.println(x--);//12(11)
        System.out.println(--x);//10
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);// 10+12=22
        System.out.println(b++ + b++); //10+11=21
        int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);
        int a=10;// Arithmetic
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(10*10/5+3-1*4/2);
        System.out.println(10<<2);// left shift operator
        System.out.println(10<<3);
        System.out.println(20<<2);
        System.out.println(15>>4);
        System.out.println(20>>2);
        System.out.println(20>>>2);
        System.out.println(-20>>2);
        System.out.println(-20>>>2);
        int a=10;// logical &&
        int b=5;
        int c=20;
        System.out.println(a<b&&a<c);
        System.out.println(a<b&a<c);*/
        int a=10;//logical && vs Bitwise &
        int b=5;
        int c=20;
        System.out.println(a<b&&a++<c);
        System.out.println(a);
        System.out.println(a<b&a++<c);
        System.out.println(a);
    }
}
