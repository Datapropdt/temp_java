/* program to find the biggest and smallest of ten numbers  */
import java.util.*;    /* is used for using Scanner class in a program */
class j3
{
public static void main(String args[])
{
int a[]= new int[10];  /* array is to be declared like this  10 2 35 5 1*/
int i,big,small;

Scanner s=new Scanner(System.in);

System.out.print(" enter value for a[0] = " ); // to print text only
a[0] = s.nextInt(); // to get the value to a[0]

big=a[0]; // big =10
small=a[0]; // small =10
for (i=1;i<10;i++) // i++ can be written i = i+1
{
System.out.print(" enter value for a[ "  +   i  +    "]"   +   " = " ); 
a[i] = s.nextInt();

if (big < a[i])  big = a[i];
if (small >a[i]) small = a[i];
}

System.out.println(" big = "+big+" small = "+small);
}
}