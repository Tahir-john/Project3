 
public class StaticNonStatic{

 public static int staticVar = 10;

    // non-static data member
    public int nonStaticVar = 20;

    // static method
    public static void staticMethod() {
        System.out.println("Static method accessed");
    }

    // non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method accessed");
    }

    public static void main(String[] args) {
        // accessing static data member and method
        System.out.println("Static variable: " + StaticNonStatic.staticVar);
        StaticNonStatic.staticMethod();

        // creating object to access non-static data member and method
        StaticNonStatic obj = new StaticNonStatic();
        System.out.println("Non-static variable: " + obj.nonStaticVar);
        obj.nonStaticMethod();

        // changing static data member
        StaticNonStatic.staticVar = 30;
        System.out.println("Updated static variable: " + StaticNonStatic.staticVar);

        // creating another object to access updated static data member
        StaticNonStatic obj2 = new StaticNonStatic();
        System.out.println("Updated static variable accessed through obj2: " + obj2.staticVar);
    }
}

