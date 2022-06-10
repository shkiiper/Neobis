import java.util.Scanner;
public class Combiner
{
    public static void combiner(String str1, String str2)
    {
        StringBuilder s = new StringBuilder();
        String part;
        int Short;
        if(str1.length() == str2.length())
        {
            Short = str1.length();
            part = "";
        }
        else if(str1.length() > str2.length())
        {
            Short = str2.length();
            part = str1.substring(str2.length(), str1.length());
        }
        else
        {
            Short = str1.length();
            part = str2.substring(str1.length(), str2.length());
        }

        for(int i = 0; i < Short; i++)
        {
            s.append(str1.charAt(i));
            s.append(str2.charAt(i));
        }
        System.out.println(s.append(part));
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 0; i < num; i++)
        {
            combiner(in.next(), in.next());
        }
    }

}
