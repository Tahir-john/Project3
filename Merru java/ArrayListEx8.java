import java.util.ArrayList;
class ArrayListEx8{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<String>();
list.add("Afroz");
list.add("Rachana");
list.add("Meeru");
Iterator itr=list.Iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
