// 1. The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a java program that demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a vegetable. Crete and display instances of these objects. Override the toString() method of object to return a string with the name of vegetable and its color. [A]

abstract class Vegetable{
    String name,color;
    Vegetable(String name, String color) {
        this.name = name;
        this.color = color;
    }
    abstract void display();
}

class Potato extends Vegetable{

    Potato(String name,String color) {
        super(name, color);
    }

    void display() {
        System.out.println(name + " " +color);
    }
}

class Brinjal extends Vegetable{

    Brinjal(String name,String color) {
        super(name, color);
    }

    void display() {
        System.out.println(name + " " +color);
    }
}

class Tomato extends Vegetable{

    Tomato(String name,String color) {
        super(name, color);
    }

    void display() {
        System.out.println(name + " " +color);
    }
}

class VegetableDemo{
    public static void main(String[] args) {
        Potato p  = new Potato("Potato", "Skin");
        Brinjal b = new Brinjal("Brinjal", "Purple");
        Tomato t = new Tomato("Tomato", "Red");
        p.display();
        b.display();
        t.display();
    }
}