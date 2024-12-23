// 1. WAP to demonstrate the use of interface in TypeScript. (A)

interface Animal { 
    name: string; 
    sound(): void;
}

class Cat implements Animal{
    name: string;
    
    constructor(name: string) {
        this.name = name;
        }

        sound(): void { 
            console.log(`${this.name} says: Meow.. Meow..!`);
        }
}

const myCat = new Cat("Sammy");

myCat.sound();

