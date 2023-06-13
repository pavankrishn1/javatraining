import java.io.*;
class CopyFile
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("C:\\kp\\theboy.txt");
BufferedReader br=new BufferedReader(fr);
int i;
while((i=br.read())!=-1)
{ 
out.write((char)i);
}
FileWriter f1=new FileWriter("C:\\kp\\k.txt");
out.writeTo(f1);
f1.close();
System.out.print("sucess....");
}
} 