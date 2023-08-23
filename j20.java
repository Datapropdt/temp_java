//string arrays
class j20
{
public static void main(String args[])
{
String str = "Hello";
char s='a';
char arr[] = {'p','r','o','g','r','a','m'}; 
// used to store individual chars to arr but not print
String s2 = new String (arr);
String s3 = new String(arr, 2, 3); // from 2nd position 3 letters

System.out.println("\n str = "+str+"\t s2 = "+s2+"\t s3 = "+s3);
}
}
/*
G:\sastry\javaprgs>javac j20.java

G:\sastry\javaprgs>java j20

 str = Hello     s2 = program    s3 = ogr

G:\sastry\javaprgs>*/