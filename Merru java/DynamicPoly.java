class Animal{
void Volume(){
System.out.println("Animal makes a Volume");
}
}
class Dog extends Animal{
void Volume(){
System.out.println("Dog barks");
}
}
class Cat extends Animal{
void Volume(){
System.out.println("Cat Meows");
}
}
class DynamicPoly{
public static void main(String args[]){
Animal myAnimal=new Animal();
Animal myDog=new  Dog();
Animal myCat=new Cat();
//calling function
myAnimal.Volume();
myDog.Volume();
myCat.Volume();
}
}

