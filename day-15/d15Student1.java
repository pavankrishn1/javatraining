class Student1
{
public int id;
public String name;
public void display()
{
System.out.println(this.id+""+this.name);
}
}
class Test1
{
public static void main(String args[])
{
Student ob=new Student();
ob.id=25841;
ob.name="pavan";
System.out.println(ob.id+""+ob.name);
}
}