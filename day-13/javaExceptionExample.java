 class javaExceptionExample
{
public static void main(String args[])
{
try
{
int data=100/0;
int p=20;
}
catch(ArithmeticExceptio e)
{
System.out.println(e);
}
System.out.println("rest of the code...");
}
}