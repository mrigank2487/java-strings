package strings;
import java.io.*;
import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner Sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String to check if it is a palindrome: ");
        s=Sc.nextLine();
        
        
        int c=0,j=0;
        for (int i=s.length()-1; i>=0; i--)
        {
            if(s.charAt(i)==s.charAt(j))
              c++;
            j++;
        }
        if(c==s.length())
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");
    }
}
