import java.util.*;
class d6printpatten2
{
public static void printLine(char c,int col)
{
System.out.println();
for(int j=1;j<=col;j++)
System.out.println(c);
}
printLine();
public static void printpatten(char c,int n)
{
for(int i=1;i<=i;i++)
printLine(c,i);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printpatten(ch,row);
}
}