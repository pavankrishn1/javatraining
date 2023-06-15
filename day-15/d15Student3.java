class Student3
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
{
id=446;name="pavan";
}
}
class Test3
{
public static void main(String args[])
{
Student3 ob1=new Student3();
ob1.displayStudent();
Student3 ob2=new Student3();
ob2.displayStudent();
}
}