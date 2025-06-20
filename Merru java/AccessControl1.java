class AccessControl1{
public int publicVal= 10;
private int privateVal= 20;
protected int protectedVal= 30;
 public void display(){
 System.out.println("Public variable:" +publicval);
 System.out.println("Private variable:" +privateval);
 System.out.println("Protected variable:" +protectedval);
 }
 }
 public class Main{
 public static void main(String[]args){
 AccessControl obj=new AccessControl();
 System.out.println("Accessing public variable:"+obj.PublicVal);
// System.out.println("Accessing private variable:"+obj.privateVal);//
 System.out.println("Accessing protected variable:"+obj.Protectedval);
 obj.display();
 }
 }
 