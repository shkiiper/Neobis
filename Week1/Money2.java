package com.company;
import java.util.*;
import java.util.Scanner;
import static java.lang.Math.round;

public class Money2
{
    public static void main(String[] args)
    {
        int n1, n2, n3 , n4 , n5, n6, n7;
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        int num2;
        num2= (int) num;
        n1 = num2 / 100;
        System.out.println("NOTAS:");
        System.out.println(n1 + " nota(s) de R$ 100,00");
        n1 = num2 - (n1 * 100);
        n2 = n1 / 50;
        System.out.println(n2 + " nota(s) de R$ 50,00");
        n2 = n1 - (n2 * 50);
        n3 = n2 / 20;
        System.out.println(n3 + " nota(s) de R$ 20,00");
        n3 = n2 - (n3 * 20);
        n4 = n3 / 10;
        System.out.println(n4 + " nota(s) de R$ 10,00");
        n4 = n3 - (n4 * 10);
        n5 = n4 / 5;
        System.out.println(n5 + " nota(s) de R$ 5,00");
        n5 = n4 - (n5 * 5);
        n6 = n5 / 2;
        System.out.println(n6 + " nota(s) de R$ 2,00");
        n6 = n5 - (n6 * 2);
        n7 = n6 / 1;
        System.out.println("MOEDAS:");
        System.out.println(n7 + " moeda(s) de R$ 1.00");
        double m1;
        int m2,m3,m4,m5;
        m1=((num-num2)*100);
        int x= (int)m1;
        x=x/50;
        System.out.println(round(x) + " moeda(s) de R$ 0,50");
        x=(int)m1-(x*50);
        m2= (int) (x/25);
        System.out.println(m2 + " moeda(s) de R$ 0,25");
        m2= (int) (x-(m2*25));
        m3=m2/10;
        System.out.println(m3 + " moeda(s) de R$ 0,10");
        m3= (int) (m2-(m3*10));
        m4=m3/5;
        System.out.println(m4 + " moeda(s) de R$ 0,05");
        m4= (int) (m3-(m4*5));
        m5=m4/1;
        System.out.println(m5 + " moeda(s) de R$ 0,01");
    }
}

