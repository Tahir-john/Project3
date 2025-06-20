class MutableImmutable{
public static void main(String args[]){
String str="Hello Meeru!";
System.out.println("Original String: "+str);
str=str+"Welcome";
System.out.println("Modified String: "+str);
StringBuilder sb=new StringBuilder("Hello");
System.out.println("Original StringBuilder: "+sb);
sb.append("Welcome");
System.out.println("Modified StringBuilder: "+sb);
}
}
