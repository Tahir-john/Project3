class List{
public static void main(String args[]){
 List<String> list=new List<String>();
list.add("Java");
list.add("python");
list.add("php");
list.add("ruby");
System.out.println(list);
for(String s:list)
{
System.out.println(s);
}
}
}
