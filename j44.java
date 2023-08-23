/* j44 Program 2: Write a program with generic method which displays any type of data Generic method example */
class MyClass
{<T>
void display_data (T arr[])
{
for (int i=0;i<arr.length; i++) 
System.out.print ("\t" + arr[i]);
System.out.println ();
}
}
class j44
{
public static void main(String args[])
{MyClass obj = new MyClass ( ); 
Integer a[] ={1,2,3,4,5,6};
 System.out.print ("Reading Integer Objects: "); 
obj.display_data (a);
Float b[] = {11f,22f,34f};
System.out.print ("Reading Float Objects: "); 
obj.display_data (b);
String c[] = {"Subash","Chandra","Bose"}; 
System.out.print ("Reading String Objects: ");
obj.display_data (c);
}
}
/*G:\sastry\javaprgs>javac j44.java

G:\sastry\javaprgs>java j44
Reading Integer Objects:        1       2       3       4       5       6
Reading Float Objects:  11.0    22.0    34.0
Reading String Objects:         Subash  Chandra Bose

G:\sastry\javaprgs> */