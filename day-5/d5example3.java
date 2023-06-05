import java.util.Scanner;
class d5example3{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i=scob.nextInt();
int j=scob.nextInt();
if(j==0) System.out.println("DIVISION by error");
System.out.println(i+"division by"+j+" is "+(i/j));
} 
}   