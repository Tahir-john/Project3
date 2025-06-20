import java.util.Scanner;
class NumberChecker{
 public static void main(String [] args){
 Scanner scanner=new Scanner(System.in);
System.out.print("Enter a number:");
int num=
 scanner.nextInt();
scanner.close();
System.out.println("Is Armstrong Number:"+isArmstrong(num));
System.out.println("Is Prime Number:"+isPrime(num));
System.out.println("Is Palindrome Number:"+isPalindrome(num));
System.out.println("Is Perfect Number:"+isPerfect(num));
}
public static boolean isArmstrong(int num){
int temp=num;
int sum=0;
int digitCount=countDigits(num);
 while(temp != 0){
 int digit =temp%10;
 sum+=(int)
 Math.pow(digit, digitCount);
 temp/=10;
 }
 return sum == num;
 }
 public static int countDigits(int num){
	 int count =0;
	 while(num!=0){
		 num/=10;
		 count ++;
	 }
	 return count;
 }
 public static boolean
 isPrime(int num){
	 if(num<=1){
		 return false;
	 }
	 for(int i=2;i<=Math.sqrt(num);i++){
		 if(num%i==0){
			 return false;
		 }
	 }
	 return true;
 }
 public static boolean
 isPalindrome(int num){
	 int temp=num;
	 int reversed=0;
	 while(temp!=0){
		 int digit = temp%10;
		 reversed= reversed * 10+digit;
		 temp/=10;
	 }
	 return reversed==num;
 }
 public static boolean
 isPerfect(int num){
	 int sum=0;
	 for(int i=1;i<num;i++){
		 if(num%i==0){
			 sum+=i;
		 }
	 }
	 return sum==num;
 }
}
