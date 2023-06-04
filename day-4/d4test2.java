import java.util.*;
class d4test2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
String str="";
if(a>b)
{
int c=a/b;
for(int i=0;i<=c;i++)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)System.out.print(str.charAt(i));
}
} 
}

