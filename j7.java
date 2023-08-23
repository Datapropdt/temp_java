// program using swith case *
import java.util.Scanner;
class j7
{
public static void main(String args[])
{
int dn; /* day number */

Scanner s=new Scanner(System.in);
System.out.println("\n enter weekday no : ");
dn=s.nextInt();
switch(dn)
{
case 1: System.out.println( " monday ");break;
case 2: System.out.println( " tuesday ");break;
case 3: System.out.println( " wednesday ");break;
case 4: System.out.println( " thursday ");break;
case 5: System.out.println( " friday ");break;
case 6: System.out.println( " saturday ");break;
case 7: System.out.println( " sunday ");break;
default:
         System.out.println( " invalid day ");
}  }   }
/*
G:\sastry\javaprgs>javac j7.java

G:\sastry\javaprgs>java j7

 enter weekday no :
4
 thursday

G:\sastry\javaprgs>*/