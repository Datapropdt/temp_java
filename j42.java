/* j42 Write a program to print random numbers using Math class Generating random numbers */
class j42
{
public static void main(String args[]) throws Exception
{
while(true)
{
double d =10* Math.random();
int i = (int) d;
System.out.print ("\t" + i);
if (i== 0)
System.exit (0);
}
}
}
