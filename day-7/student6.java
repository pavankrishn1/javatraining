class student6
{
int rollno;
String name;
float fee;
student6(int rollno, String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+""+name+""+fee);
}
class testthis2
{
public static void main(String args[])
{
student6 s1=new student6(440,"vinod",80000f);
student6 s2=new student6(446,"pavan",70000f);
s1.display();
s2.display();
}
}
}