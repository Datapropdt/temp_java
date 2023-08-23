/*Program 2: Write a program to take a 2D array and display its elements in the form of a 
matrix
Displaying a 2D array as a matrix */
class j19
{
public static void main(String args[])
{
//take a 2D array
int x[ ][ ] = {{1, 2, 3,9}, {4, 5, 6,8} };

 // display the array elements
for (int i = 0 ; i < 2 ; i++)
{System.out.println (); 
for (int j= 0 ; j < 4 ; j++)
System.out.print(x[i][j] + "\t");
}
}
} 