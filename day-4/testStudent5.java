class student2
{
int rollno;
String name;
Student()
{
rollno=0;name="";
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation()
{
System.out.println(rollno+" "+name);
}
}
class testStudent5
{
public static void main(String args[])
{ 
student2 s1;
student2 s2=new student2(440"vinod");

s1.displayinformation();
s2.displayinformation();
}
