/* j27: Program to initialize student details using parameterized  constructor and displaying the same, also giving values at runtime and passed to constructor */
import java.util.Scanner;
 class Student
{
int rollNo; 
String name; 
Student (int n, String s) //parameterized constructor or constructor with parameters method as class name 
{
rollNo = n;
name = s;
}
void display ()
{
System.out.println ("Student Roll Number is: " + rollNo);
System.out.println ("Student Name is: " + name);
}
}
class j27
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); // to create scanner class object
System.out.println("enter rno, name "); 
int rno=sc.nextInt();  // to give input at runtimea
String name=sc.next();

Student s1 = new Student (101,"sastry");
System.out.println("s1 object contains: ");
 s1.display ();
Student s2 = new Student (rno,name); 
System.out.println ("s2 object contains: ");
 s2.display ();
}
}
/*
G:\sastry\javaprgs>javac j27.java

G:\sastry\javaprgs>java j27
enter rno, name
1000 srivalli
s1 object contains:
Student Roll Number is: 101
Student Name is: sastry
s2 object contains:
Student Roll Number is: 1000
Student Name is: srivalli
*/