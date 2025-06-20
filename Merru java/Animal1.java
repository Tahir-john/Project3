// Animal.java (Interface)

public interface Animal1 {
    void sound();
    void eat();
}

// Dog.java (Class implementing Animal interface)

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats dog food");
    }
}

// Cat.java (Class implementing Animal interface)

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats cat food");
    }
}

// Main.java (Main class)

public class Main {
// Main.java (Main class)

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        dog.eat();

        cat.sound();
        cat.eat();
    }
}
}
