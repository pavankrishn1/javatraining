import java.util.StringTokenizer;
class StringTokenizer2
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("my name is pavan","");
while(st.hasMoreElements())
{
System.out.println(st.nextToken());
}
}
}