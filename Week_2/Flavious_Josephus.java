import java.util.Scanner;
public class Flavious_Josephus
{
        static int FGL(int n, int k)
        {
                if (n == 1)
                    return 1;
                else
                    return (FGL(n - 1, k) + k - 1) % n + 1;
        }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i =1;i==T;i++) {
            int N = in.nextInt();
            int K = in.nextInt();

            System.out.println("Case "+i+" " + FGL(N, K));
        }
    }
    }

