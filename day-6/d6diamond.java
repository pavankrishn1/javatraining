public class d6diamond
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.nextInt().charAt(0);
int row=sc.nextInt();
printpatternU(ch,row);
}
public static void printpatternU(char c,int n)
for(int i=n/2,j==n;j+=2)
printLine(c,i,j);
} 
public static void printpatternU(char c,int nch1,int nch2)
{
System.out.print(\n);
char ch='&';
for(int i=0;i<nch1;i++)
System.out.print(ch);
for(int i=0;i<nch2;i++)
System.out.print(ch);
 for(int i=0;i<nch1;i++)
System.out.print(ch);
}
}
 		 	

