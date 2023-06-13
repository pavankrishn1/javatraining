import java.util.ArrayList;
 import java.util.List;
 class d13tosetmethod
 {
 public static void main(String args[])
 {
 ArrayList<String>languages=new ArrayList<>();
languages.add("java");languages.add("python");languages.add("c++");
System.out.println("List:"+languages);
languages.set(2,"javascript");
System.out.println("modified List:"+languages);
}
}