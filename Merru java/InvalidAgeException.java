public class InvalidAgeException extends Exception{
public InvalidAgeException(String message){
super (message);
}
}
public class User {
private int age;
public User (int age) throws 
  InvalidAgeException {
  if(age < 18){
     throw new 
	 InvalidAgeException("Age must be 18 or above");
	 }
	 this.age=age;
	 }
	 public int getAge(){
	  return age;
	  }
	  }
	  public class Main{
	  public static void main(String args[]){
	   try{
	   User user=new User(15);
	   System.out.println("User age:"+user.getAge());
	   }
	   catch
	   (InvalidAgeException e){
	   System.out.println(e.getMessage());
	   }
	   }
	   }
	   