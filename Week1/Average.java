package com.company;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Average {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0;i<T;i++)
        {
                double x1 = in.nextDouble();
                double x2 = in.nextDouble();
                double x3 = in.nextDouble();
                double res;
                res=((x1*2)+(x2*3)+(x3*5))/10;
                res=(res*10)/10;
            System.out.printf("%.1f",res);
        }
    }
}
