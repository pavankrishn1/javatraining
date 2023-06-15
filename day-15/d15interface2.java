interface Printable
{
void print();
}
interface Showable extends Printable
{
void show();
}
class testInterface3 implements Showable
{
public void print()
{
System.out.println("hello");
}
public void show()
{
System.out.println("welcom");
}
public static void main(String args[])
{
testInterface3 obj=new testInterface3();
obj.print();
obj.show();
}
}
