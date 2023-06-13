class animald10
{
public void move()
{
System.out.println("animal can move");
}
}
class Dog extends animald10
{
public void move()
{
System.out.println("Dogs can walk and run");
}
}
class testDog
{
public static void main(String args[])
{
animald10 a=new animald10();
animald10 b=new Dog();
a.move();
b.move();
}
}
