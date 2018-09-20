package strings;

import java.io.IOException;
import java.util.Scanner;


public class VowelsAndConsonantsCheck 
{
    public static void main(String[] args) throws IOException 
    {
    Scanner Sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String: ");
        s=Sc.nextLine();
        int v=0,c=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                v++;
            else
                c++;
        }
        
        System.out.println("There are "+v+" vowels and "+c+" consonants.");
    }
}
