/* j47 */
interface Marks
{
public void display();
}

interface Sports extends Marks
{
public void show();
}

class Student implements Sports
{

void display( )
{
System.out.println("Displaying marks");
}

void show()
{
System.out.println("Displaying sports marks");
}

}
class j47
{
public static void main(String[] args) 
{
Student s=new Student();
s.display( );
s.show( );
}
}
