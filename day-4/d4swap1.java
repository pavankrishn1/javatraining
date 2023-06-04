import java.util.Scanner;
class d4swap1{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1,num2;
num1=scob.nextInt();
num2=scob.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println(num1+" "+num2);
}
}


