import java.util.Scanner;
 class ExceptionHandlingDemo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
try{ 
//Taking input for two numbers
System.out.println("Enter the numerator:");
int numerator = Scanner.nextlnt();
System.out.println("Enter the denominator:");
int denominator = Scanner.nextlnt();
// Attempting to divide the numbers  
int result=numerator/denominator;
System.out.println("The result is:"+result);
}
//Handling division by zero 
catch(ArithmeticException e){
	System.out.println("Error:Division by zero is not allowed!");
}
//Handling invalid input types
catch
(java.util.InputMismatchException e){
	System.out.println("Error:Please enter valid integers!");
}
//catching any other unforeseen exceptions
catch(Exception e){
	System.out.println("An unexpected error occured:"+e.getMessage());
}
//Finally block to clean up 
finally{
	System.out.println("Exception completed!");
	Scanner.close();
}
}
 }
 
	