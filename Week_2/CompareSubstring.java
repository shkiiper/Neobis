import java.util.Scanner;
public class CompareSubstring
{
    public static void count(String str, String str2)
    {
        int L = 0;
        int R = 1;
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            String str3 = str.substring(L, R);
            if(str2.contains(str3))
            {
                R++;
                count = str3.length();
            }
            else
            {
                L++;
                R++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            count(in.nextLine(), in.nextLine());
        }
    }
}