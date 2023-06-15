import java.util.StringTokenizer;
class simple
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("my name is pavan","");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}