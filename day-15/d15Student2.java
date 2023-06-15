class Student2
{
public int id;
public String name;
public void display()
{
System.out.println(this.id+""+this.name);
}
public void displayStudent()
{
display();
}
}
class Test2
{
public static void main(String args[])
{
Student2 ob=new Student2();
ob.displayStudent();
ob.id=25841;
ob.name="pavan";
ob.displayStudent();
}
}