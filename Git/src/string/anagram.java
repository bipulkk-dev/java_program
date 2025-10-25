package string;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two words");
        String a=sc.next();
        String b= sc.next();
        if(a.length()!=b.length())
        {
            System.out.println("not anagram");
            System.exit(0);
        }
        else {
            boolean f=false;
            a=a.toUpperCase();
            b=b.toUpperCase();
            int c=0,d=0;
            for(char x='A';x<='z';x++)
            {
                for(int p=0;p<a.length();p++)
                {
                    if(a.charAt(p)==x)
                    {
                        c++;
                    }
                    if(b.charAt(p)==x){
                        d++;
                    }
                }
                if(c!=d){
                    f=false;
                    break;
                }
                else{
                    f=true;
                }
            }
            if(f)
            {
                System.out.println("anagram");
            }
            else {
                System.out.println(" not anagram");
            }

        }
    }
}
