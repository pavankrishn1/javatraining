import java.util.*;
class d6printpattern6{
public static void printastar(int k,char c)
{
System.out.println();
for(int i=0;i<=k;i++)   
System.out.print(c);
}
public static void reversepattern(int n,char c)
{
for(int i=0;i<n-2;i--)
printastar(i,c);
}
public static void printpattern(int n,char c)
{
for(int i=0;i<=n;i++)
{
if(i%2==0)
printastar(i,c);
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
char ch=scob.next().charAt(0);
}
}
}