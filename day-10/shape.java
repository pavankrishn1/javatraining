abstract class shape
{
abstract void draw();
}
class rectangle extends shape
{
void draw()
{
System.out.println("drawing rectangle");
}
}
class circle extends shape
{
void draw()
{
System.out.println("drawing circle");
}
}
class testabstraction
{
public static void main(String args[])
{
shape s=new circle();
s.draw();
shape r=new rectangle();
r.draw();
}
}
