/*j33Program 1: Write a program to create a Person class which contains general details of a  person and create a sub class Employ which contains company details of a person Reuse the general details of the person in its sub class Inheritance Example */
 class Person
{
String name;
String permanentAddress; 
int age;
void set_PermanentDetails (String name, String  permanentAddress, int age)
{this.name = name; 
this.permanentAddress = permanentAddress; 
this.age = age;
}
void get_PermanentDetails ()
{System.out.println ("Name : " + name);
System.out.println ("Permanent Address : " + 
permanentAddress); 
System.out.println ("Age :" + age);
}
}
class Employ extends Person // employ came from person, so person 3 details, employ 3 details will come
{int id;
String companyName; 
String companyAddress;
Employ (int id, String name, String permanentAddress, int age,
String companyName, String companyAddress)
{
this.id = id;
set_PermanentDetails (name, permanentAddress, age);
this.companyName = companyName;
this.companyAddress = companyAddress;
}
void get_EmployDetails ()
{System.out.println ("Employ Id : " + id); 
get_PermanentDetails ();
System.out.println ("Company Name : "+ companyName);
System.out.println ("Company Address : "+companyAddress);
}
}
class j33
{
public static void main (String args [])
{Employ e1 = new Employ (101, "Suresh Kumar", "18-Madhura Nagar-Tirupati", 29, "Centris Software- Chennai", "20-RVS Nagar");
e1.get_EmployDetails ();
}
}
/*
G:\sastry\javaprgs>java j33
Employ Id : 101
Name : Suresh Kumar
Permanent Address : 18-Madhura Nagar-Tirupati
Age :29
Company Name : Centris Software- Chennai
Company Address : 20-RVS Nagar
*/



