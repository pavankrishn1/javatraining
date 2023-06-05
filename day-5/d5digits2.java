import java.util.Scanner;
class d5digits2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int rd=0;
System.out.print("enther the positive integer:");
n=sc.nextInt();
while(n>0)
{
rd=rd*10+(n%10);
n=n/10;
}
System.out.println("the reverse digits is:"+rd);
}
}