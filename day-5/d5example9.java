import java.util.Scanner;
class d5example9{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int result=1;
for(int i=1;i<=a;i++)
{
result*=i;
}
System.out.println("number of the afactorial:"+result);
}
}

