/*Write a program to accept and display student details
Accepting and displaying student  details*/

import java.io.*;
class j17
{
public static void main(String args[]) throws IOException
{
// Create BufferedReader object to accept data
 //Accept student details
System.out.print ("Enter roll number: ");
int rno = Integer.parseInt (br.readLine()); // to read integer value
System.out.print ("Enter Gender (M/F): ");
char gender = (char)br.read(); 
br.skip(1);
// if we remove this it will not ask for name 
System.out.print ("Enter Student name: ");
String name = br.readLine(); // to read text
System.out.println ("Roll No: " + rno);
System.out.println ("Gender: " + gender);
System.out.println ("Name: " + name);
}
}