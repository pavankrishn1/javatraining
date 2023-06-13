import java.io.*;
class FilerRederDigits
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("C:\\kk\\pp.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countDigits=0;
while((i=br.read())!=-1)
{ 
if(((char)i>='0')&&((char)i<='9'));
countDigits++;
}
System.out.println(countDigits);
br.close();
fr.close();
}
}