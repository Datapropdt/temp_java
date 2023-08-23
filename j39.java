/* j39 Program 4: Write a program to convert one class type into another class type conversion of one class type into another class 
type  */
class One
{
void show1()
{
System.out.println ("One\'s method");
}
}
class Two extends One
{
void show2()
{
System.out.println ("Two\'s method");
}
}
class j39
{
public static void main(String args[])
{
/* If super class reference is used to refer to super class object then only super class members are available to programmer */
One ob1 = new One ();
ob1.show1 ();
/* If sub class reference is used to refer to sub class object then super class members as well as sub class members are available to the programmer */
Two ob2 = new Two();
ob2.show1();
ob2.show2();
/* If super class reference is used to refer to sub class object then super class methods 
are available, sub class methods are not available unless they override super class methods */
One ob3 = (One) new Two(); // Generalization 
ob3.show1();
/* It is not possible to access any methods if we use subclass object to refer to super class as above */
Two ob4 = (Two) new One();
ob4.show1();
ob4.show2();
// Specialization
One ob5 = (One) new Two();
Two ob6 = (Two) ob5;
ob6.show1();
ob6.show2();
}
}
/*output
E:\SASTRY\java>java j39
One's method
One's method
Two's method
One's method
Exception in thread "main" java.lang.ClassCastException: One cannot be cast to Two
        at j39.main(j39.java:37)

E:\SASTRY\java>*/
