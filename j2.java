/* program to read 2 numbers at runtime and find their sum */
import java.util.*; /* is used for using Scanner class in a program */
class j2
{
public static void main(String args[])
{
int a,b;
Scanner s=new Scanner(System.in); // by creating object for scanner class we can get the input for it

System.out.print(" enter value for a  : "); 
a = s.nextInt();
System.out.print("\n enter value for b  : "); 
b = s.nextInt();
int c = a + b;
System.out.println(" sum = "+c);
}
}
/*
G:\sastry\javaprgs>javac j2.java

G:\sastry\javaprgs>java j2
 enter value for a  : 56

 enter value for b  : 9
 sum = 65

G:\sastry\javaprgs> 
// Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // String input
        String name = sc.nextLine();
 
        // Character input
        char gender = sc.next().charAt(0);
 
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
*/