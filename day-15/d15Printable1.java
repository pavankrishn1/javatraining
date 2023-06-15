interface Printable
{
void main();
}
interface showerble
{
void show();
}
class A implements Printable.Showerble
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
A obj=new A();
obj.print();
obj.show();
}
}
