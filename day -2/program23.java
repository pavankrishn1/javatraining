import java.util.*;
public class program23{
static int diff(int a,int b)
{
return a-b;
}
static int product(int a,int b)
{
return a*b;
}
static int smaller(int a,int b)
{
if(a<b)return a;
if(b<a)return b;
return 0;
}
static int largest(int a,int b)
{
if(a>b)return a;
if(b>a)return b;
return 0;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2,result;
System.out.print("Enter the number:");
num1=sc.nextInt();
System.out.print("Enter the number:");
num2=sc.nextInt();
result=diff(num1,num2);
System.out.println("Different is "+result);
result=product(num1,num2);
System.out.println("product is "+result);
result=smaller(num1,num2);
System.out.println("Smaller "+result);
result=largest(num1,num2);
System.out.println("largert is "+result);
}
}



