class animal2
{
void eat()
{
System.out.println("eating....:");
}
}
class dog extends animal2
{
void bark()
{
System.out.println("barking...:");
}
}
class cat extends animal2
{
void meow()
{
System.out.println("meowing...:");
}
}
class testinheritance3
{
public static void main(String args[])
{
cat c=new cat();
c.meow();
c.eat();
dog d=new dog();
d.bark();
d.eat();
}
}
