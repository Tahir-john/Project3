import java.util.Arrays;
import java.util.Scanner;
class AthleteSorter{
public static void main(String [] args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the number of athletes:");
int n= 
  scanner.nextInt();
String[][] athletes=new String[n][2];
System.out.println("Enter the athlete's name and timing:");
for(int i=0;i<n;i++){
athletes[i][0]=scanner.next();
athletes[i][1]=scanner.next();
}
  Arrays.sort(athletes,(a,b)->a[1].compareTo(b[1]));
  System.out.println("Sorted Athletes:");
  for(String[] athlete:athletes){
  System.out.println(athlete[0]+"-"+athlete[1]);
  }
  }
  }
  