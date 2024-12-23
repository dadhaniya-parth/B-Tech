// 4. Demonstrate the use of Super Keyword. [A]

class Animal{
    String name;

    Animal(String name){
        this.name=name;
    }

    void display(){
        System.out.println("Animal name is: "+name);
    }
}

class Dog extends Animal{
    String breed;
    Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    void display(){
        super.display();
        System.out.println("breed: "+breed);
    }
}

public class SuperDemo{
    public static void main(String[] args) {
        Dog d = new Dog("Stella", "Solid Masti");
        d.display();
    }
}
