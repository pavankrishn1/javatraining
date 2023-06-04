class empolyee
{
int rollno;
String name;
float salary;
void insert(int r,String n,float s)
{
rollno=r;
name=n;
salary=s;
}
void display()
{
System.out.println(rollno+" "+name+" monthly salary is "+salary);
}
}
class testempolyee
{
public static void main(String args[])
{ 
empolyee s1=new empolyee();
empolyee s2=new empolyee();
empolyee s3=new empolyee();
s1.insert(440,"vinod",99999);
s2.insert(446,"pavan",90039);
s3.insert(446,"jaya",950852);
s1.display();
s2.display();
s3.display();
}
}


