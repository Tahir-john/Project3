import java.util.ArrayList;
import java.util.HashSet;
class SimpleProgram{
public static void main(String args[]){
ArrayList<String> colorsList=new ArrayList<>();
colorsList.add("Red");
colorsList.add("Green");
colorsList.add("Blue");
HashSet<String> cl=new HashSet<>();
cl.add("Red");
cl.add("Green");
cl.add("Yellow");
System.out.println("ArrayList:"+colorsList);
System.out.println("HashSet:"+cl);
}
} 
