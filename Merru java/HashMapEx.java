import java.util.*;
class HashMapEx{
public static void main(String args[]){
HashMap<String,Integer> m=new HashMap<>();
m.put("Ziya",99);
m.put("Meeru",90);
m.put("Zaba",80);
m.put("Zainab",70);
System.out.println(m);
for(Map.Entry<String,Integer> m1:m.EntrySet())
	System.out.println(m1.getkey()+""+m1.getvalue());

}
}
