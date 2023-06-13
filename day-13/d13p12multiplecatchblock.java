 public cla
{
public static void main(String args[])
{
try{
int a[]=new int[5];
a[5]=30/0;
}
catch(ArithmeticException e)
{
System.out.println(" Arthemetic occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBounds Exception occurs");
}
catch(Exception e)
{
System.out.println("parant Exception occurs");
}System.out.println("Rest of the code");
}
}