import java.util.Scanner;
public class Column_inArray {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        String T= in.next();
        String str1="S";
        String str2="M";
        double sum=0,avg=0;
        double result=0;
        double[][] N = new double[12][12];
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                N[i][j] = in.nextDouble();
                if (j == C)
                {
                    if(T.equals(str1))
                    {
                        sum=sum+N[i][C];
                        result=sum;
                    }
                    if(T.equals(str2))
                    {
                        sum=sum+N[i][C];
                        avg=sum/12;
                        result=avg;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
