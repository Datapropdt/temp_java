// program to find the given number is prime or not *
import java.util.Scanner;
class j5
{
public static void main(String args[])
{
int n,i,fc=0;
Scanner s=new Scanner(System.in);

System.out.println("enter a number ");
n=s.nextInt();
for (i=1;i<=n;i++) if (n%i==0) fc++;

if (fc==2)
    System.out.println(n + " is prime ");
else
    System.out.println(n + " is not  prime ");
}
}
/*
G:\sastry\javaprgs>javac j5.java

G:\sastry\javaprgs>java j5
enter a number
56
56 is not  prime

G:\sastry\javaprgs>java j5
enter a number
5
5 is prime

G:\sastry\javaprgs>
*/