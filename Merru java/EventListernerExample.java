import java.util.*;
class MyEvent{
private String message;
public MyEvent(String message){
this.message= message;
}
public String getMessage(){
return message;
}
}
interface MyEventListener{
void onEvent(MyEvent event);
}
 class MyEventListener{
public void onEvent(MyEvent event){
System.out.println("Received event:"+ event.getMessage());
}
}
class MyEventSource{
private MyEventListener listener;
public void setListener(MyEventListener listener){
this.listener=listener;
}
public void generateEvent(String message){
MYEvent event=new MYEvent(message);
if(listener !=null){
listener.onEvent(event);
}
}
}
public class EventListernerExample{
public static void main(String[] args){
MyEventSource source= new MyEventSource();
MYEventListenerImpl listener=new MYEventListenerImpl();
source.setListener(listener);
source.generateEvent("Hello, world!");
source.generateEvent("This is an event.");
}
}

