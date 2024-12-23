// 2. WAP to demonstrate the use of classes in TypeScript. (A)

class Car{
    make : string;
    model : string;
    year : number;

    constructor(make:string,model:string,year:number){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    displayDetails():void{
        console.log(`Car: ${this.year} ${this.make} ${this.model}`);       
    }
}

const myCar = new Car("Ferrari","SF90",2019);
myCar.displayDetails();