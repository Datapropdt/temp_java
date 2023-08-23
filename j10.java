/*Switch Statement: When there are several options and we have to choose only oneoption from the available ones, we can use switch statement
Syntax:switch (expression)
{case value1: //statement sequence
break;
case value2: //statement sequence
break;
……………
case valueN: //statement sequence
break;
default: //default statement sequence
}
Here, depending on the value of the expression, a particular corresponding case will be 
executed
Program 2: Write a program for using the switch statement to execute a particular task depending on color value
To display a color name depending on color value */

class j10
{
public static void main(String args[])
{
char color = 'o'; 

switch (color)
{ 
case 'r': System.out.println ("red"); break;
case 'y': System.out.println ("yellow"); break;
case 'g': System.out.println ("green"); break;
case 'b': System.out.println ("blue"); break;
case 'o': System.out.println ("orange"); break;

default: System.out.println ("No Color Selected");
}
}
}
