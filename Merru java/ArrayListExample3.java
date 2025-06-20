import java.util.ArrayList;
class ArrayListExample3{
public static void main(String args[]){
ArrayList<Integer> item=new ArrayList<>();
item.add(100);
item.add(200);
item.add(300);
item.add(400);
System.out.println("Item="+item);
for(Integer i:item)
{
	System.out.println(i);
}
}
}
