/*Program 6: Write a program to use „this‟ to refer the current class parameterized constructor and current class instance variable this demo */
class Person
{
String name;

Person ( )
{
this.name="Ravi Sekhar"; // calling present class parameterized constructor 
this.display ( ); // calling present class method
}
void display( )
{
System.out.println ("Person Name is = " + name);
}
}
class j30
{public static void main(String args[])
{
Person p = new Person( );
Person q = new Person( );
}
}
/*
G:\sastry\javaprgs>java j30
Person Name is = Ravi Sekhar
Person Name is = Ravi Sekhar
*/