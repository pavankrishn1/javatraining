import java.util.Scanner;
class Prg1d2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:"); 
n=sc.nextInt();
if(n%2==0)
{
System.out.print("Even\n");
System.out.print(n+"is Even\n");
}
else
{
System.out.print("odd\n");
}
}
}
