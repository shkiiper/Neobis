package com.company;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Triangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double A = in.nextDouble();
        Double B = in.nextDouble();
        Double C = in.nextDouble();

        Double n;
        if (B > A && B > C) {
            n = A;
            A = B;
            B = n;
        }
        if (C > A && C > B) {
            n = A;
            A = C;
            C = n;
        }

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }


        if (A.equals(B) && A.equals(C))
        {
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if (B.equals(A) && B != C || (C.equals(B) && B != A) || (A.equals(C) && C != A) )
        {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
