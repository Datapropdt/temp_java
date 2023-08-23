/*Java’s Jump Statements: Java supports three jump statements: break, continue and return
These statements transfer control to another part of the program
o break:
break can be used inside a loop to come out of it
break can be used inside the switch block to come out of the switch block
break can be used in nested blocks to go to the end of a block Nested blocks
represent a block written within another block
Syntax: break; (or) break label;//here label represents the name of the block */

class j14
{
public static void main(String args[])
{
int i;

for (i=1; i<=20; i++)
if  (i==10) // breaks out of loop when i = 10
break; 
System.out.print (i + "\t");

}
}
