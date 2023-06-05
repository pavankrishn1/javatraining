class d5example7
{
public static void main(String args[])
{
String str="";
int i=0;
while(i<=10)
{
str=str+i+",";
i++;
}
while(i<=str.length()-1)
{
System.out.print(str.charAt(i));
i++;
}
}
}