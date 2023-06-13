 import java.util.ArrayList;
 import java.util.List;
 class d13collectionofframework2
 {
 public static void main(String args[])
 {
 ArrayList<Integer>numbers=new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed element:"+number);
int removedNumber=numbers.remove(1);
System.out.println("removed element:"+removedNumber);
System.out.println("List:"+numbers);
}
}