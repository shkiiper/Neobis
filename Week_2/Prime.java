import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {
        int num,p;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        for (int i = 0; i < p; i++)
        {
            num = sc.nextInt();
            if (num%7==0 && num %1==0)
                System.out.println(num + " eh primo");
            else
                System.out.println(num + " nao eh primo");
        }
    }
}
