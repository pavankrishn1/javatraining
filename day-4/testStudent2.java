class student
{
int id;
String name;
}
class testStudent2
{
public static void main(String args[])
{
student s1=new student();
student s2=new student();
s1.id=446;
s1.name="pavan";
s2.id=446;
s2.name="pavan";
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
}
}
