class factorial
{
public static int calculaterfactorial(int n)
{
if(n==0)
return 1;
else return n*calculaterfactorial(n-1);
return 0;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int intputNum=sc.nextInt();
if( int inputNum<0)
System.out.println("INVALID");
else
System.out.println(calculaterfactorial(inputNum));
}
}