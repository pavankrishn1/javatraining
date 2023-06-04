class salary
{
int rollno;
String name;
flote salaer;
void insert(int r,String n,flote s)
{
rollno=r;
name=n;
salary s;
}
void display()
{
System.out.println(rollno+" "+name+" "+salary);
}
}
class testsalary
{
public static void main(String args[])
{ 
salary s1=new salary();
salary s2=new salary();
salary s3=new salary();
s1.insert(440,"vinod",80000);
s2.insert(446,"pavan",79000);
s3.insert(446,"jaya",75000);
s1.display();
s2.display();
s3.display();
}
}


