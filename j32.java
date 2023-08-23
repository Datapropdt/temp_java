/*Program 2: Write a program to access static variable using static method static method accessing static variable*/
class Sample
{
static int x = 10; 
static void display( )
{
x++;
System.out.println (" x value is = " + x);
}
}
class j32
{
public static void main(String args[])
{
System.out.print ("Calling static method using Class name : "); 
Sample.display ();
Sample s1 = new Sample ( );
System.out.print ("Calling static method using Object name :"); s1.display ();
}
}
/*
G:\sastry\javaprgs>javac j32.java

G:\sastry\javaprgs>java j32
Calling static method using Class name :  x value is = 11
Calling static method using Object name : x value is = 12
*/
