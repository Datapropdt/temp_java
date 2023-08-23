/* j40 Program 1: Write an example program for abstract class
Using abstract methods and classes */
abstract class Figure
{
double dim1,dim2;
Figure(double a,double b)
{ 
dim1 = a;
dim2 = b;
}
abstract double area (); // area is now an abstract method
}
class Rectangle extends Figure
{
Rectangle (double a, double b)
{
super (a, b);
}
double area () // override area for rectangle
{
System.out.println ("Inside Area of Rectangle"); 
return  dim1 * dim2;
}
}
class Triangle extends Figure
{
Triangle (double a, double b)
{
super (a, b);
}
double area() // override area for right triangle
{
System.out.println ("Inside Area of Triangle"); 
return dim1 * dim2 / 2;
}
}
class j40
{
public static void main(String args[])
{
// Figure f = new Figure(10, 10); // illegal now 
Rectangle r = new  Rectangle(9, 5); 
Triangle t = new Triangle(10, 8); 
System.out.println("Area is " + r.area()); 
System.out.println("Area is "+ t.area());
}
}
/*
G:\sastry\javaprgs>javac j40.java

G:\sastry\javaprgs>java j40
Inside Area of Rectangle
Area is 45.0
Inside Area of Triangle
Area is 40.0

G:\sastry\javaprgs>*/
