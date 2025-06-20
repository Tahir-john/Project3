class Person { 
    public String name; // Accessible from anywhere
    private int age; // Accessible only within Person class
    protected String address; // Accessible within the same package and subclasses
    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); // Can access private variable within the class
        System.out.println("Address: " + address);
    }
}

class Employee extends Person { // Inherits from Person 
    public void setAge(int age) { // Can access protected variable "address"
        this.age= age;
    }
}

public class AccessControlDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30, "123 Main St");
        person1.displayDetails(); 
        
        Employee employee1 = new Employee();
        employee1.name = "Jane Smith"; // Accessing public variable
        // employee1.age = 25; // Cannot access private variable directly
        employee1.address = "456 Elm St"; // Accessing protected variable within subclass
    }
}