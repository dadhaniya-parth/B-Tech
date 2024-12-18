// 4. WAP to perform Type Assertion in TypeScript. (B)

interface User {
    name: string;
    age: number;
}

let someData: any = { name: "Parth", age: 20, email: "parthdadhaniya6@gmail.com" };

let userData = someData as User;
console.log(`Name: ${userData.name}`);
console.log(`Age: ${userData.age}`);

