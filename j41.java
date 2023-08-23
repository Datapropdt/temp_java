/* j41 charcter class :Program 1: Write a program which shows the use of Character class methods Testing a char */
import java.io.*;
class j41
{public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
System.out.print ("Enter a character : " );
char ch = (char) br.read();
if (Character.isDigit (ch) )
System.out.println ("It is a digit");
else if (Character.isUpperCase (ch)) System.out.println ("It is a Upper Case Letter");
else if (Character.isLowerCase (ch) ) System.out.println ("It is a Lower Case Letter");
else if ( Character.isSpaceChar (ch)) System.out.println ("It is a Space bar");
else if ( Character.isWhitespace (ch) ) System.out.println ("Dont know what is this character");
}
}
/*G:\sastry\javaprgs>java j41
Enter a character : 1
It is a digit

G:\sastry\javaprgs>java j41
Enter a character : A
It is a Upper Case Letter

G:\sastry\javaprgs>java j41
Enter a character :
It is a Space bar */
