import java.util.*;
class d13AgeDoesNotFitException extends Exception
{
String msg;
AgeDoesNotFitException(String msg)
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
class main{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try{
if(age<18)
{
throw new AgeDoesNotFitException("Entered age/doesn't fullfill the required age limit");
}
} 
catch(AgeDoesNotFitException e)
{
System.out.println(e);
System.out.println(e.getMessage());
}
}
}