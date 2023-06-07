class d7c
{
public void disp()
{
System.out.println("method of class c");
}
}
class a extends c
{
public void disp()
{
System.out.println("method of class a");
}
}
class b extends c
{
public void disp()
{
System.out.println("method of class b");
}
}
class d extends a
{
public void disp()
{
System.out.println("method of class d");
}
public static void main(String args[])
{
d obj = new d();
obj.disp();
}
}

