public class d13p3multipulecatchblock3
{
public static void main(String args[])
{
try{
String s=null;
System.out.println(s.length());
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