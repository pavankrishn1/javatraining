class student2
{
int rolln0;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation()
{
System.out.println(rollno+" "+name);
}
class testStudent4
{
public static void main(String args[])
{ 
student4 ob=new Student();
student s1=new student();
student s2=new student();
s1.insertRecord(440,"vinod");
s2.insertRecord(446,"pavan");
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
}
}

}
