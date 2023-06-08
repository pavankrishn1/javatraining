class student
{
int rollno;
String name;
static String college="MTIET";
student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
 class teststaticVariable1
{
public static void main(String args[])
{
student s1=new student(440,"vinod");
student s2=new student(446,"pavan");
//student,collage="mtiet";
s1.display(); 
s2.display();
}
}