import java.util.Scanner;
public class Perfectnum {
    public static int Perfect(int num) {

        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
        {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int num, s, p;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        for (int i = 0; i < p; i++)
        {
            num = sc.nextInt();
            s = Perfect(num);
            if (s == num)
                System.out.println(num + " eh perfeito");
            else
                System.out.println(num + " nao eh perfeito");
        }
    }
}
