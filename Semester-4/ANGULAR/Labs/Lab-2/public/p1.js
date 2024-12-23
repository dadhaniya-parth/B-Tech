"use strict";
// 1. WAP to demonstrate the use of interface in TypeScript. (A)
class Cat {
    constructor(name) {
        this.name = name;
    }
    sound() {
        console.log(`${this.name} says: Meow.. Meow..!`);
    }
}
const myCat = new Cat("Sammy");
myCat.sound();
