package com.company;
import java.util.*;
import java.lang.Math;
public class Logical_Sequence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int x1=X;
        for(int i=1;i<=Y;i++)
        {
            System.out.print(i+" ");
            if(i==X)
            {
                System.out.println();
                X=x1+X;
            }
        }
    }

}
