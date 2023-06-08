class testouter
{
static int data=30;
static class inner
{
void msg()
{
System.out.println("data:" +data);
}
}
 public static void main(String args[])
{
testouter.inner obj=new testouter.inner();
obj.msg();

}
}