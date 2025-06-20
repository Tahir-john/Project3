public class AccessControl {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;

    public void publicMethod() {
        System.out.println("Public method accessed");
    }

    private void privateMethod() {
        System.out.println("Private method accessed");
    }

    protected void protectedMethod() {
        System.out.println("Protected method accessed");
    }

    public void accessMembers() {
        System.out.println("Public variable: " + publicVar);
        System.out.println("Private variable: " + privateVar);
        System.out.println("Protected variable: " + protectedVar);
        publicMethod();
        privateMethod();
        protectedMethod();
    }
}

// AccessControlChild.java

public class AccessControlChild extends AccessControl {
    public void accessInheritedMembers() {
        System.out.println("Public variable: " + publicVar);
        // System.out.println("Private variable: " + privateVar); // Error: privateVar is private
        System.out.println("Protected variable: " + protectedVar);
        publicMethod();
        // privateMethod(); // Error: privateMethod is private
        protectedMethod();
    }
}

// Main.java

public class Main1 {
    public static void main(String[] args) {
        AccessControl obj = new AccessControl();
        obj.accessMembers();

        AccessControlChild childObj = new AccessControlChild();
        childObj.accessInheritedMembers();
    }
}
