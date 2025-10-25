package string;
import java.util.Scanner;
public class CharFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("enter a string");
        str = sc.nextLine();
        str = str.toUpperCase();

        for (char x = 'A'; x <= 'Z'; x++) {
           int c = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == x) {
                    c++;
                }
            }
            if (c != 0) {
                System.out.println(x + ":" + c);
            } else {
                continue;
            }
        }
    }
}
