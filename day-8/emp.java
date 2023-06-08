class emp
{
int id;
String name;
Address address;
public emp(int id,String name,Address address)
{
this.id=id;
this.name=name;
this.address=address;
}
void display()
{
System.out.println(id+""+name+"");
System.out.println(address.city+""+address.state+""+address.country);
}
public static void main(String args[])
{
Address address1=new Address("palamanar","ap","india");
Address address2=new Address("chittor","ap","india");
emp e1=new emp(440,"vinod",address1);
emp e2=new emp(446,"pavan",address2);
e1.display();
e2.display();
}
}