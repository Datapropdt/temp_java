/* j25: 
Program to initialize student details using default constructor and displaying the 
same */

 class Student
{
int rollNo; 
String name; 

Student () // default constructor or constructor with no parameters : method name same as class name 
{
rollNo = 101;
name = "Suresh";
}
void display ()
{
System.out.println ("Student Roll Number is: " + rollNo);
System.out.println ("Student Name is: " + name);
}
}
class j25
{
public static void main(String args[])
{
Student s1 = new Student ();
 System.out.println("s1 object contains: ");
 s1.display ();
Student s2 = new Student (); 
System.out.println ("s2 object contains: ");
 s2.display ();
}
}
/*
s1 object contains:
Student Roll Number is: 101
Student Name is: Suresh
s2 object contains:
Student Roll Number is: 101
Student Name is: Suresh
*/
