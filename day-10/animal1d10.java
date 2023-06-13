class animal1d10
{
public void move()
{
System.out.println("call from animal class");
}
}
class wild extends animal1d10
{
public void move()
{
System.out.println("call from wild class");
}
}
class pet extends animal1d10
{
public void move()
{
System.out.println("call from pet class");
}
}
class testanimal
{
public static void main(String args[])
{
animal1d10 a=new animal1d10();
animal1d10 w=new wild();
animal1d10 p=new pet();
a.move();
w.move();
p.move();
}
}
