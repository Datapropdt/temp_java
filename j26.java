/* j26: 
Program to initialize student details using parameterized  constructor and displaying the 
same */

 class Student
{
int rollNo; 
String name; 

Student (int n, String s) // parameterized constructor or constructor with parameters : method name same as class name 
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
class j26
{
public static void main(String args[])
{
Student s1 = new Student (101,"sastry");
 System.out.println("s1 object contains: ");
 s1.display ();
Student s2 = new Student (102," harshit"); 
System.out.println ("s2 object contains: ");
 s2.display ();
}
}
/*
G:\sastry\javaprgs>javac j26.java

G:\sastry\javaprgs>java j26
s1 object contains:
Student Roll Number is: 101
Student Name is: sastry
s2 object contains:
Student Roll Number is: 102
Student Name is:  harshit */