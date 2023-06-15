import java.util.StringTokenizer;
class simple1
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("my,name,is,pavan");
//while(st.hasMoreTokens())
System.out.println("next token is:"+st.nextToken(","));
System.out.println("next token is:"+st.nextToken(","));
System.out.println("next token is:"+st.nextToken(","));
System.out.println("next token is:"+st.nextToken(","));
}
}
