/* j36 : dynamic polymorphism Program 1: Write a program to create a class which contains two methods with the same name but with different signatures overloading of methods --------- Dynamic polymorphism */

class Sample
{
void add(int a,int b)
{
System.out.println ("sum of two="+ (a+b));
}
void add(int a,int b,int c)
{
System.out.println ("sum of three="+ (a+b+c));
}
}
class j36
{
public static void main(String[] args)
{
Sample s=new Sample ( ); 
s.add(20, 25);
s.add (20, 25, 30);
}
}
/*output
E:\SASTRY\java>javac j36.java

E:\SASTRY\java>java j36
sum of two=45
sum of three=75

E:\SASTRY\java>*/
