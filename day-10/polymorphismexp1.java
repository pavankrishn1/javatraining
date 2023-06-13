class polymorphismexp1
{
void print()
{
System.out.println("welcom");
}
void print(String n)
{
System.out.println("welcom "+n);
}
}
class test
{
public static void main(String args[])
{
polymorphismexp1 ob1=new polymorphismexp1();
ob1=print();
Scanner sc=new Scanner(System.in);
System.out.println("please type your name:");
String s=sc.next();
ob1.print();
}
}


