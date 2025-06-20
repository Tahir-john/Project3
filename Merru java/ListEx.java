class Student{
string name;
float   per;
int rollno;
Student(string name, float per,int rno)
{
name=n;
per=pe;
rollno=rno;
}
}
class ListEx{
public static void main(String args[]){
ArrayList<Student> slist=new ArrayList<Student>();
Student s1=new Student("Afroz",1,75);
Student s2=new Student("Meeru",2,80);
Student s3=new Student("Ziya",3,85);
Student s4=new Student("Zeba",4,90);
  
  
  slist.add(s1);
  slist.add(s2);
  slist.add(s3);
  slist.add(s4);
  
  Iterator
  
  
  
  
  <Student>= slist.iterator();
  while(i.hasnext())
  {
  Student s=(Student) i.next();
  {
  System.out.println("Name="+s.name);
  System.out.println("per="+s.per);
  System.out.println("rno="+s.rno);
  }
  }
}
}

  
  