/* j38 Program 3: Write a program to illustrate static polymorphism Static Polymorphism */
class Animal
{
static void move ()
{
System.out.println ("Animals can move");
}
}
class Dog extends Animal
{
static void move ()
{System.out.println ("Dogs can walk and run");
}
}
class j38a
{
public static void main(String args[])
{Animal.move (); 
Dog.move ();
}
}
/*
G:\sastry\javaprgs>java j38a
Animals can move
Dogs can walk and run
*/