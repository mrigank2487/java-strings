package strings;
import java.io.*;
import java.util.Scanner;
public class CheckEmail 
{
    public static void main(String args[]) throws IOException
    {
        Scanner Sc=new Scanner(System.in);
        String s;
        int l,c=0;
        
        String com = ".com";
        String in = ".in";
        String coin = ".co.in";
        String edu = "edu.in";
        
        System.out.println("Enter an Email address: ");
        s=Sc.nextLine();
        l=s.length();
        
        for(int i=0; i<l; i++)
          if(s.charAt(i)=='@')  
             c++;
        
        if(c==1)
        {
            if(((s.substring(l-4,l).equals(com)))||((s.substring(l-3,l).equals(in)))||((s.substring(l-6,l).equals(coin)))||((s.substring(l-6,l).equals(edu))))
              System.out.println("It is a valid Email address."); 
            else
              System.out.println("It is an invalid Email address. ");
        }
        else
            System.out.println("It is an invalid Email address. ");
    }
}
