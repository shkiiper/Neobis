package com.company;
import java.util.Scanner;

public class Football {
    public static void main(String[] args)
    {
        int kol=0,I = 0,G=0,N=0;
        String winner;
        while(true)
        {
            int choise = 0;
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int y = in.nextInt();
            if(x>y)
            {
                I++;
                winner= "Inter";
            }
            else
            {
                G++;
                winner="Gremio";
            }
            if(x==y)
            {
                N++;
            }
            kol++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            choise= in.nextInt();
            if(choise==2)
            {
                System.out.println(kol+" grenais");
                System.out.println("Inter:"+I);
                System.out.println("Gremio:"+G);
                System.out.println("Empates:"+N);
                System.out.println(winner+" venceu mais");
                break;
            }
        }
    }

}
