/* j29:  copy constructor 
Program to initialize student details using parameterized  constructor and displaying the same */
class Student
{
int rollNo; 
String name; 
Student (int n, String s)//parameterized constructor or constructor with parameters:method name as class name 
{
rollNo = n;
name = s;
}
Student(Student s) // copy constructor
{
rollNo=s.rollNo;
name=s.name;
}
void display ()
{
System.out.println ("Student Roll Number is: " + rollNo);
System.out.println ("Student Name is: " + name);
}
}
class j29
{
public static void main(String args[])
{
Student s1 = new Student (101,"sastry"); // parameterized constructor activated
 System.out.println("s1 object contains: ");
 s1.display ();
Student s2=new Student(s1);  // using copy constructor
System.out.println ("s2 object contains: ");
 s2.display ();
}
}
/*
G:\sastry\javaprgs>java j29
s1 object contains:
Student Roll Number is: 101
Student Name is: sastry
s2 object contains:
Student Roll Number is: 101
Student Name is: sastry */
