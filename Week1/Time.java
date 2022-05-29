package com.company;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Time
{
    public static void main(String[] args)
    {
        int H = 24, M=60;
        Scanner in = new Scanner(System.in);
        int H1 = in.nextInt();
        int M1 = in.nextInt();
        int H2 = in.nextInt();
        int M2 = in.nextInt();
        if(H2>H1 && M2>M1)
        {
            H=H2-H1;
            M=M2-M1;
            System.out.print("O JOGO DUROU "+H+" HORA(S) E "+M+" MINUTO(S)");
        }
        if(H2==H1 && M2==M1)
        {
            M=0;
            System.out.print("O JOGO DUROU "+H+" HORA(S) E "+M+" MINUTO(S)");
        }
        if(H2==H1 && M1>M2)
        {
            H=H-1;
            M=M-(M1-M2);
            System.out.print("O JOGO DUROU "+H+" HORA(S) E "+M+" MINUTO(S)");
        }
        if(H1<H2 && M1>M2)
        {
            H=H2-H1;
            if(H<=1)
            {
                H=H-1;
                M=M-(M1-M2);
                System.out.print("O JOGO DUROU "+H+" HORA(S) E "+M+" MINUTO(S)");
            }
        }
    }
}
