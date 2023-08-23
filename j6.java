// program to find the given number is prime or not *
import java.util.Scanner;
class j6
{
public static void main(String args[])
{
int n,i,fc=0,hn,j;
Scanner s=new Scanner(System.in);
System.out.println("\n how many numbers ");
hn=s.nextInt();

for(j=1;j<=hn;j++)
{
System.out.println("enter a number ");
n=s.nextInt();
fc=0;
for (i=1;i<=n;i++) if (n%i==0) fc++;

if (fc==2)
    System.out.println(n + " is prime ");
else
    System.out.println(n + " is not  prime ");
}
}
}