class j1
{
public static void main(String args[])
{
int a=5;
int b=10; 

double c=5.789;
String name="naidu";

System.out.println(" hello  "+ name); 
	// + operator combines string,variable
System.out.println("value of a = "+a);
System.out.println("value of b = "+b);
System.out.println("value of c = "+c);
System.out.println(" sum of  "+ a + " and " + b + " = " + (a+b));
// sum of a + b + c = answer
System.out.println(" sum of  "+ a + "  " + b + " +  " + c +" = " + (a+b+c));
}
}

/*
G:\sastry\javaprgs>javac j1.java

G:\sastry\javaprgs>java j1
 hello  naidu
value of a = 5
value of b = 10
value of c = 5.789
 sum of  5 and 10 = 15
 sum of  5 and 10 +  5.789 = 20.789

G:\sastry\javaprgs> */