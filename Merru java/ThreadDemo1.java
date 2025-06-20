class Mythread extends Thread{
public void run(){
System.out.println("Child thread is running");
}
}
class ThreadDemo1{
public static void main(String args[]){
Mythread m=new Mythread();
m.start();
}
}
