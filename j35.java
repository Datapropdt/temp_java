/*j35 Program 3: Write a program to access the super class method, super class parameterized constructor and super class instance variable by using super keyword from sub class
super refers to super class- constructors, instance variables and 
methods  */
class A
{
int x; 
A (int x)
{
this.x = x;
}
void show( )
{
System.out.println("super class method: x = "+x);
}
}
class B extends A
{ 
int y;
B (int a,int b)
{
super(a);
y=b;
// (or) x=a;
}
void show( )
{
 super.show ();
System.out.println ("y = "+y);
System.out.println (" super x = " + super.x);
}
}
class j35
{
public static void main(String args[])
{
B ob = new B (10, 24); 
ob.show ( );
}
}

/* output 
E:\SASTRY\java>java j35
super class method: x = 10
y = 24
 super x = 10

E:\SASTRY\java>
*/
