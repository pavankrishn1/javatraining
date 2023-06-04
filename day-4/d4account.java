class account
{
int accno;
String name;
float amount;
void insert(int a,String n,float amt)
{
accno=a;
name=n;
amount=amt;
}
void deposit(float amt)
{
amount=amount+amt;
System.out.println(amt+"deposited");
}
void widthdrow(float amt)
{
if(amount<amt){
System.out.println("insufficient balance");
}
else
{
amount=amount-amt;
System.out.println(amt+"widthdrow");
}
}
void checkBalance()
{
System.out.println("balance is:"+amount);
}
}
class TestAccount
{
public static void main(String args[]){
account a1=new account();
a1.insert(616229,"pavan",10000);
a1.checkBalance();
a1.deposit(4000);
a1.widthdrow(200);
a1.checkBalance();
}
}




