import java,util.*;
class test
{
public static void main(String args[])
{
Scannersc=new Scanner(System.in);
String strobj=sc.nextLIne();
String res"";
for(int i=0;i<strobj.length()-1;i++)
{
if(strobj.charAt(i)>='o'&& strobj.charAt(i)<='9')
{
res=res+strobj.charAt(i);
}
}
System.out.println(res);
}
}