import java.util.*;
class d6printpallendrome
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
for(int i=10;i<=10000000;i++)
{
int num=i;
int rd;
int temp=num;
for(rd=0;num>0;num=num/10)
{
rd=rd*10+(num%10);
}
if(temp==rd)
System.out.print(temp+" ");
}
}
}