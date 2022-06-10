import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] F = new int[62];
        F[0]=0;
        F[1]=1;
        for (int i=2;i<62;i++)
        {
            F[i] = F[i-2]+F[i-1];
        }
        int n = in.nextInt();
        int[] jump = new int[n];
        for (int i = 0; i < n; i++)
        {
            jump[i]= in.nextInt();
        }
        for (int index : jump)
        {
            System.out.println("Fib(" + index + ") = " + F[index]);
        }
    }
}
