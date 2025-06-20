class CustomException extends Exception{
public CustomException(String message){
  super (message);
  }
  }
  public class 1Main{
  public static void main(String[] args){
  try{
     int age=15;
	 if(age<18){
	 throw new CustomException("Age must be 18 or above.");
	 }
	 else{
	 System.out.println("Welcome!You are eligible");
	 }
	 }
	 catch(CustomException e){
	 System.out.println("Exception caught:"+e.getMessage());
	 }
	 }
	 }
	 