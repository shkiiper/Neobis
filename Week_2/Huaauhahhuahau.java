import java.util.Scanner;
public class Huaauhahhuahau {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String haha = "";
        for(int i=0 ; i<str.length() ; i++)
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                haha = haha + str.charAt(i);
        String rehaha = new StringBuilder(haha).reverse().toString();
        if (haha.equals(rehaha)) {
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
    }
}
