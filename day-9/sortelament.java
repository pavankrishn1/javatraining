import java.util.*;
class sortelament
{
public static void main(String args[])
{
int n,i=0;
Scanner s=new Scanner(System.in);
System.out.print("enter no.of element you want in array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter all the element:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++ )
System.out.println(i);
}
}
