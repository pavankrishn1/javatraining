class  d9animal1
{
String color="white";
}
class Dog extends d9animal1
{
String color="black";
void printcolor()
{
System.out.println(color);
System.out.println(super.color);
}
}
class testsuper
{
public static void main(String args[])
{
Dog d=new Dog();
d.printcolor();
}
}
