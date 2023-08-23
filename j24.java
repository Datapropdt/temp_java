// j22.java Program 1: Write a program to display details of student using class and object 
//Program to display the details of a student using class and object
class Student
{ 
int rollNo; //properties -- variables
String name;
void display () //method -- action
{ 
System.out.println ("Student Roll Number is: " + rollNo);
System.out.println ("Student Name is: " + name);
}
}
class j24
{
public static void main(String args[])
{
//create an object to Student class
Student s = new Student ();
s.rollNo=100; // we can assign the values to members after creating student object
s.name="harshit";
//call display () method inside Student class using object 
s.display();
}
}