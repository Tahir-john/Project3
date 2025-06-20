import java.util.*;
 class TestVector1{
 public static void main(String args[]){
 Vector<String> v=new Vector<String>();//creating vector
 v.add("Afroz");//method of Collection
 v.addElement("Rachana");//method of Vector
 v.addElement("Meeru");
 //traversing elements using Enumeration
 Enumeration e=v.elements();
 while(e.hasMoreElements()){
 System.out.println(e.nextElement());
 }
 }
 }
