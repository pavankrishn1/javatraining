import java.util.StringTokenizer;
class StringTokenizer1
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("demonstrating methods from StringTokenizer class","");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}