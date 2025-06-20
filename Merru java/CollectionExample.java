import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class CollectionExample{
public static void main(String [] args){
 ArrayList<String>arrayList =new ArrayList<>();
 arrayList.add("Apple");
 arrayList.add("Banana");
 arrayList.add("Custard Apple");
 arrayList.add("orange");
 
 System.out.println("ArrayList Elements:"+arrayList);
// for(int i=0;i<arrayList.size();i++)//
	 System.out.println( i+ ":" +arrayList.get(i));
 System.out.println("ArrayList size:"+arrayList.size());
 HashSet<String> hashSet=new HashSet<>();
 hashSet.add("Apple");
 hashSet.add("Banana");
 hashSet.add("Custard Apple");
 hashSet.add("orange");
 System.out.println("\nHashSet elements:"+ hashSet);
 System.out.println("HashSet size:"+ hashSet.size());
 HashMap<String,Integer> hashMap=new HashMap<>();
 hashMap.put("Apple", 1);
 hashMap.put("Banan" ,2);
 hashMap.put("custard Apple",3);
 hashMap.put("orange", 4);
 System.out.println("\nHashMap elements:" +hashMap);
 System.out.println("HashMap size:" +hashMap.size());
}
}

 