import java.util.Scanner;
public class passwords_validator
{
    public static boolean control1(String str)
    {
        for (char ch: str.toCharArray())
        {
            if (Character.isAlphabetic(ch))
            {
                return true;
            }
            else if(Character.isDigit(ch))
            {
                return true;
            }
            else {
                return false;
            }
        }
        if (str.length()>=6 && str.length()<=32)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean control2(String str)
    {
        int num=0,UP=0,small=0;
        for (char chh:str.toCharArray())
        {
            if (Character.isDigit(chh)){
                num++;
            }
            else if (Character.isUpperCase(chh)){
                UP++;
            }
            else if(Character.isLowerCase(chh)){
                small++;
            }
        }
        if (num>0 && UP>0 && small>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        public static void main (String[]args)
        {
            Scanner in = new Scanner(System.in);
            while (in.hasNext())
            {
                String str = in.nextLine();
                if (control1(str) && control2(str))
                {
                    System.out.println("Senha valida.");
                }
                else
                {
                    System.out.println("Senha invalida.");
                }
            }
        }
    }

