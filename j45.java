/* j45 Program 1: Write an example program for interface */
interface Shape
{
void area ();
void volume ();
double pi = 3.14;
}
class Circle implements Shape
{
double r;
Circle (double radius)
{r = radius;}
public void area ()
{System.out.println ("Area of a circle is : " + pi*r*r );
}
public void volume ()
{System.out.println ("Volume of a circle is : " + 2*pi*r);
}
}
class Rectangle implements Shape
{
double l,b;
Rectangle (double length, double breadth)
{l = length;
 b = breadth;
}
public void area ()
{System.out.println ("Area of a Rectangle is : " + l*b );
}
public void volume ()
{System.out.println ("Volume of a Rectangle is : " + 2*(l+b));
}
}
class j45
{public static void main (String args[])
{Circle ob1 = new Circle (102); 
ob1.area ();
ob1.volume ();
Rectangle ob2 = new Rectangle (126,2355); 
ob2.area ();
ob2.volume ();
}
}
/*G:\sastry\javaprgs>javac j45.java

G:\sastry\javaprgs>java j45
Area of a circle is : 32668.56
Volume of a circle is : 640.5600000000001
Area of a Rectangle is : 296730.0
Volume of a Rectangle is : 4962.0

G:\sastry\javaprgs>*/