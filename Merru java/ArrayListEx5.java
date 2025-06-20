import java.util.ArrayList;
class ArrayListEX5{
public static void main(String args[]){
ArrayList<String> al=new ArrayList<String>();
al.add("Afroz");
al.add("Rachana");
al.add("Meeru");
ListIterator<String> i=al.list.Iterator();
while(i.hasNext()){
System.out.println(i.next());
}
}
}
