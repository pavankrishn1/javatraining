class Student2
{
int id;
String name;
Student2(int i,String n)
{
id=i;
name=n;
}
Student2(Student2 s )
{
id=s.id;
name=s.name;
}
void display(){System.out.println(id+""+name);}
public static void main(String ards[])
{
Student2 s1=new Student2(440,"vinod");
Student2 s2=new Student2(446,"pavan");
s1.display();
s2.display();
}
}