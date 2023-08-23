/*Program 1: Write a program to accept elements into an array and display same.  */
import java.io.*;
class j18
{
public static void main (String args[]) throws IOException
{
//Create a BufferedReader class object (br)
BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
System.out.println ("How many elements:" );
int n = Integer.parseInt (br.readLine ());
//create a 1D array with size n
int a[] = new int[n]; // declaration of array

System.out.print ("Enter elements into array : ");
for (int i = 0; i<n;i++)
a [i] = Integer.parseInt ( br.readLine ()); 

System.out.print ("The entered elements in the array are: ");
 for (int i =0; i < n; i++)
System.out.print (a[i] + "\t");
}
}
