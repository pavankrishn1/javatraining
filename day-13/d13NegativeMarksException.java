import java.util.*;
class NegativeMarksException extends Exception
{
String msg;
NegativeMarksException(String msg)
{
super(msg);
this.msg=msg;
}
@Override
public String toString()
{
return msg;
}
}
class main2{ 
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
int marks=sc.nextInt();
try{
if(marks<0)
{
throw new NegativeMarksException(str+" your marks are invalid");
}
else
{
System.out.print(str+" your marks are valid");
}
} 
catch(NegativeMarksException e)
{
System.out.println(e.getMessage());
}
}
}