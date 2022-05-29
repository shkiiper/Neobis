package com.company;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Money {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        n1 = num / 100;
        System.out.println(n1 + " nota(s) de R$ 100,00");
        n1 = num - (n1 * 100);
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
        System.out.println(n7 + " nota(s) de R$ 1,00");
    }
}
