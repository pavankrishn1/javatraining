import java.util.*;
public class d6printpattern4{
public static void printastar(int k,char c)
{
System.out.println();
for(int i=0;i<=k;i++)
System.out.print(c);
}
public static void printpattern(int n,char c)
{
for(int i=n;i>=1;i--)
printastar(i,c);
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
char ch=scob.next().charAt(0);
printpattern(a,ch);
}
}