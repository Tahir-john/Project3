import java.io.*;
import java.net.*;
class MyClient{
public static void main(String args[]){
try{
Socket s=new Socket("localhost",6660);
DataOutputStream data=new DataOutputStream(s.getOutputStream());
dout writeUTF ("Hello Server");
dout.flush();
dout.close();
s.close();
}
catch(Exception e){
{
System.out.println(e);
}
}
} 
} 