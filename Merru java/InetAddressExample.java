import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddressExample{
public static void main(String args[]){
 try{
 InetAddress address=InetAddress.getByName("WWW.google.com");
 InetAddress localhost=InetAddress.getLocalHost();
 InetAddress ipAddress=InetAddress.getByName("192.168.1.1");
 printInetAddressInfo(address);
 printInetAddressInfo(localhost);
 printInetAddressInfo(ipAddress);
 } catch
 (UnknownHostException e){
 System.out.println("Unknown host:" + e.getMessage());
 }
 }
 public static void printInetAddressInfo(InetAddress address){
 System.out.println("Host Name:"+ address.getHostName());
 System.out.println("Canonical Host Name: "+ address.getCanonicalHostName());
 System.out.println("IP Address:"+ address.getHostAddress());
 System.out.println();
 }
 }
 