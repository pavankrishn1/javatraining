class bikektm125
{
 final void run()
{
System.out.println("running");
}
}
class honda extends bikektm125
{
void run()
{
System.out.println("running safely with 100kmph");
}

public static void main(String args[])
{
honda obh=new honda();
obh.run();
}
}