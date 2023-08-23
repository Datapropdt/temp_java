//Program 1: Write a program to find biggest of three numbers
import java.util.Scanner;
class j9
{
public static void main(String args[])
{
int a,b,c; 

Scanner s= new Scanner(System.in); // Scanner class is used to scan values at runtime 
System.out.println(" enter a number  : "); a = s.nextInt(); // to read a decimal number 
System.out.println(" enter a number  : "); b = s.nextInt();
System.out.println(" enter a number  : "); c = s.nextInt();
//10>20>30
if ( a> b && a>c)
System.out.println ("a is big"); 
else if ( b > c)
System.out.println ("b is big");
else
System.out.println ("c is big");
}
}
