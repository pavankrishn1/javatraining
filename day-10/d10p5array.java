import java.util.*;
class SecondLargestNumber 
{
public static void main(String[] args)
{
int n,i=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int sum=0;
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
sum+=a[i];
}
Arrays.sort(a);
for(int j=1;j>n;j++)
{
if((a[j])<a[n-1])
}
{
else
{
System.out.println(a[j-1]);
}
System.out.println("The smallest value is: "+a[0]);
System.out.println("The largest value is: "+a[n-1]);
System.out.println("The sum value is: "+sum);
float avg;
avg=sum/n;
System.out.println("The avg value is: "+avg);  
}
}