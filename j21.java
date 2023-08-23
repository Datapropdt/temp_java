//string arrays
//
import java.lang.*;
class j21
{
public static void main(String args[])
{
String str = "engineering";
String str1="civil";

str=str.concat(str1);

String st=str.toUpperCase();

System.out.println("\n length = "+str.length() + "   " +str +" " + str.charAt(5) +" " + str.contains(str1)+" " +str.compareTo(str1)+" "+str+" "+ st);

StringBuffer s=new StringBuffer("ramesh");
s.reverse();

System.out.println(s);
}
}
/*
G:\sastry\javaprgs>java j21

 length = 16   engineeringcivil e true 2 engineeringcivil ENGINEERINGCIVIL
hsemar
*/