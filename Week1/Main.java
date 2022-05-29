package com.company;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++)
        {
            double C1 = in.nextDouble();
            double C2 = in.nextDouble();
            double P1 = in.nextDouble();
            double P2 = in.nextDouble();
            int Y = 0;
            for (int j = 0; j < 102; j++)
            {
                while (C1 <= C2 + 1)
                {
                    int X1, X2;
                    int s = (int)C1;
                    int s2 = (int)C2;
                    X1 = (int) C1;
                    X2 = (int) C2;
                    C1 = (C1 * P1) / 100;
                    C2 = (C2 * P2) / 100;
                    C1 = C1 + X1;
                    C2 = C2 + X2;
                    Y++;
                }
            }
            if (Y > 100)
            {
                System.out.println("Mais de 1 seculo.");
                break;
            }
            else
            System.out.println(Y+" anos.");
            in.close();
        }
    }
}

//1.описание предметной области
//2. Описание скриптов таблиц представлений функции ограничений
//3. Клиентская часть- описать каким образом создается проект с нуля, как формируется модели подлкючение к базе данных , формирование моделей, контролерров
//для примера описываем создание контроллера для закупки сырья, описание всех методов, способы задания команды в виде запуска хранимой процедуры
//Поместить скриншоты работы самой программы на примере ЗП
//Заключение
