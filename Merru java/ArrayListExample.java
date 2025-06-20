import java.util.ArrayList;
class ArrayListExample{
public static void main(String args[]){
ArrayList<String> fruits=new ArrayList<>();
fruits.add("Apple");
fruits.add("cheery");
fruits.add("Banana");
System.out.println("Fruits:"+fruits);
for(String s:fruits)
{
System.out.println(s);
}
}
}

