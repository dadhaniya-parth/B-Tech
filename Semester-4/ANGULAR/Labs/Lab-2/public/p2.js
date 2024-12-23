"use strict";
// 2. WAP to demonstrate the use of classes in TypeScript. (A)
class Car {
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    displayDetails() {
        console.log(`Car: ${this.year} ${this.make} ${this.model}`);
    }
}
const myCar = new Car("Ferrari", "SF90", 2019);
myCar.displayDetails();
