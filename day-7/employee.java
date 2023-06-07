class employee
{
float salary=4000;
}
class programmer extends employee
{
int bonus=1000;
public static void main(String args[])
{
programmer p=new programmer();
System.out.println("programer salary is:"+p.salary);
System.out.println("bonus salary is:"+p.bonus);
}
}