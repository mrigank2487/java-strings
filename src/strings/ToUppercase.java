
package strings;

import java.io.IOException;
import java.util.Scanner;


public class ToUppercase 
{
    public static void main(String[] args) throws IOException 
    {
    Scanner Sc=new Scanner(System.in);
        String s;
        char ss=' ';
        System.out.println("Enter a String to be converted to upper case: ");
        s=Sc.nextLine();
        int j;
        for(int i=0; i<s.length(); i++)
        {
            
           if((s.charAt(i)>=97)&&s.charAt(i)<=122)
           {
            j=s.charAt(i)-32;
            ss=(char)j;
             System.out.println("String in upper case: "+ss);
           }
           else
           {
             System.out.println("String in upper case: "+ss);
           }
       
        }
     }
}