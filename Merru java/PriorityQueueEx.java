import java.util.*;
class PriorityQueueEx{
public static void main(String args[]){
PriorityQueue<String>pq=new PriorityQueue<String>();
pq.add("Apple");
pq.add("Banana");
pq.add("cherry");
pq.add("Dragn");
System.out.println("head="+pq.element());
System.out.println("peek="+pq.peek());
for(String s:pq)
	System.out.println(s);
System.out.println("poll="+pq.poll());
pq.remove();
System.out.println("After remove");
for(String s:pq)
	System.out.println(s);
}
}
