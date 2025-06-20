import java.util.*;
class TestCollection16{
public static void main(String args[]){
Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
hm.put(100,"Afroz");
hm.put(102,"Rachana");
hm.put(101,"Meeru");
hm.put(103,"Meerab");
for(Map.Entry m:hm.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}
 } 
 }
 