class customer
{
int amount=10000;
synchronized void withdraw(int amount){
System.out.println("goning to withdraw....");
if(this.amount<amount)
{
System.out.println("less balance: Waiting for deposit....");
try{wait();}
catch(Exception e){}
}
this.amount-=amount;
System.out.println("Withdraw completed....");
}
synchronized void deposit(int amount)
{
System.out.println("goning to deposit.....");
this.amount+=amount;
System.out.println("deposit completed....");
notify();
}
}
class test3
{
public static void main(String args[])
{
final customer c=new customer();
new Thread()
{
public void run()
{
c.withdraw(15000);}
}.start();
new Thread(){
public void run()
{
c.deposit(10000);}
}.start();
}
}