/* j34Program 2: Write a program to illustrate the order of calling of default constructor in super 
and sub class Default constructors in super and sub class */
class One
{
 One ( ) //super class default constructor
{
System.out.println ("Super class default constructor called");
}
}

class Two extends One
{ 
Two ( ) //sub class default constructor
{
System.out.println ("Sub class default constructor called");
}
}
class j34
{
public static void main (String args[])
{
 Two t=new Two ( ); //create sub class object
 }
}
/*
G:\sastry\javaprgs>java j34
Super class default constructor called
Sub class default constructor called */