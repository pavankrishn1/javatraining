class MyThread extends Thread
{
public void run()
{
System.out.println("shut dower hook task completed");
}
}
class teskshutdown1
{
public static void main(String args[])
{
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new MyThread());
System.out.println("now main sleeping...press ctrl+c to exit");
try
{
Thread.sleep(3000);
}
catch(Exception e){}
}
}