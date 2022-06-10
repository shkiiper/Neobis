import java.util.Scanner;
public class Ceaser_chiper {
    public static String abc="abcdefghijklmnopqrstuvwxyz";
    public static String Chiper(String msg, int jump) {
        String cipherText = "";
        for (int i = 0; i < msg.length(); i++) {
            int position = abc.indexOf(msg.charAt(i));
            int val = (jump + position) % 26;
            char replaceVal = abc.charAt(val);
            cipherText += replaceVal;
        }
        return cipherText;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String msg = new String();
        int jump = 0;
        msg = sc.next();
        jump = sc.nextInt();
        System.out.println(Chiper(msg, jump));
    }
}
