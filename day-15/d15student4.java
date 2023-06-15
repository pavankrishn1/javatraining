class student4
{
private String name;
private int age;
private String getName()
{
return this.name;
}
private int getAge()
{
return this.age;
}
private void setName(String name)
{
if(name.length()>0)
this.name=name;
else 
System.out.println("Name can't be empty");
}
private void setAge(int age)
{
this.age=age;
}
public void display()
{
System.out.println(getName()+""+getAge());
}
public void inputstudent(String n,int a)
{
setName(n);
setAge(a);
}
}
class test8
{
public static void main(String args[])
{
student4 ob1=new student4();
ob1.inputstudent("pavan",446);
student4 ob2=new student4();
ob2.inputstudent("chinni",440);
ob1.display();
ob2.display();
}
}