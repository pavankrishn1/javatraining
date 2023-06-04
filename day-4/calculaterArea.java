class angle
{
int length;
int width;
void insert(int l,int w)
{
length=l;
width=w;
}

void calculaterArea()
{
System.out.println(length*width);
}
}
class testangle
{
public static void main(String args[])
{ 
angle a1=new angle();
angle a2=new angle();

a1.insert(11,5);
a2.insert(3,15);
a1.calculaterArea();
a2.calculaterArea();
}
}

