/* program to read 2 numbers at runtime and find their sum */

import java.util.*; /* is used for using Scanner class in a program */
/* biggest of 10 numbers */
class j4
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);

System.out.print(" enter value for n = " );
n=s.nextInt();

int a[]= new int[n];  /* array is to be declared like this */

int i,big,small;

System.out.print(" enter value for a[0] = " ); 
a[0] = s.nextInt();

big=a[0];
small=a[0];
for (i=1;i<n;i++)
{
System.out.print(" enter value for a[ "+ i +"]" + " = " ); 
a[i] = s.nextInt();

if (big < a[i])  big = a[i];
if (small >a[i]) small = a[i];
}

System.out.println(" big = "+ big+ " small = " + small);
}
}