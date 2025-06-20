import java.net.InetAddress;
import java.net.UnknownHostException;
class InetAddressEx4{
public static void main(String args[]){
try{
String hostname= "www.google.com";
InetAddress inetAddress=InetAddress.getByName(hostname);
System.out.println("Hostname: " +inetAddress.getHostName());
System.out.println("IP Address: " +inetAddress.getHostAddress());
if(inetAddress.isReachable(2000)){
System.out.println(Hostname+ " is reachable.");
} else{
System.out.println(hostname+ " is not reachable.");
}
} catch(UnknownHostException e){
	System.out.println("Host not found: "+e.getMessage());
}catch(Exception e){
	System.out.println("An error occurred: "+e.getMessage());
}
}
}
