import java.util.Scanner;
class d5power{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int base;
int power;
int result=1;
System.out.println("enther the base number");
base =sc.nextInt();
System.out.println("enther the power");
power =sc.nextInt();
for(int i=1;i<=power;i++)
{
result*=base;
}
System.out.println("the result:"+result);
}
}

