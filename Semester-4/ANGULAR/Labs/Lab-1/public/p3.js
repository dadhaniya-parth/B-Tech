"use strict";
// WAP to perform basic operations on Array in TypeScript.
let arr1 = [1, 2, 3, 4, 5];
let arr2 = [6, 7, 8, 9, 10];
console.log("Array 1: ", arr1);
console.log("Array 2: ", arr2);
let arr = arr1.concat(arr2);
console.log("concat():", arr);
arr.push(11);
console.log("push(11):", arr);
arr.pop();
console.log("pop():", arr);
console.log("length:", arr.length);
console.log("indexOf(5):", arr.indexOf(5));
