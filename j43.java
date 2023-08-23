/* j43 Program 1: Write a program that has a class which stores any type of data /Example for Generic Class */
class MyClass<T>
{T obj; 
MyClass (T obj)
{
this.obj = obj;
}
T getObj ()
{
return obj;
}
}
class j43
{
public static void main(String args[])
{
 integer i1 = new integer (10);
MyClass<Integer> obj1 = new MyClass<Integer>(i1); 
System.out.println ("U stored : " + obj1.getObj() );
Double d1 = new Double(3066);
MyClass<Double> obj2 = new MyClass<Double>(d1);
System.out.println ("U Stored : " + obj2.getObj() );
MyClass<String> obj3 = new MyClass<String>("Suresh Kumar");
System.out.println ("U Stored : " + obj3.getObj() );
}
}