import java.util.*;
public class program235
{
public static void main(String args [])
{
char ch;
System.out.print("Enter a character:");
Scanner sc=new Scanner("System.in");
ch=sc.next().charAt(0);
System.out.println();
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println(ch+"is an alphabet");
}
else
{
if((ch>='0'&&ch<='9'))
{
System.out.println(ch+"is digit");
{
else
System.out.println(ch+"is a spacial charater");
}
}
}

