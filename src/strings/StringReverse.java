
package strings;
import java.io.*;
import java.util.Scanner;
public class StringReverse
{

    public static void main(String[] args) throws IOException 
    {
        Scanner Sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String");
        s=Sc.nextLine();
        
        for (int i=s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
        
    }
    
}
