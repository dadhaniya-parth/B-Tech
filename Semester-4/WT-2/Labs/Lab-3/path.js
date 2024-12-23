// Demonstrate “path” core module in NodeJS.

const path = require("path");
var pathJoin = path.join('/abc','/pqr','/xyz');
console.log("Join :",pathJoin);

var pathNormalize = path.normalize('///abc/pqr/xyz/..//dfg');
console.log("Normalize :",pathNormalize);

var pathBasename = path.basename('/abc/pqr/xyz.txt');
console.log("Basename :",pathBasename);

var extname = path.extname('/abc/pqr/xyz.txt');
console.log("Extname :",extname);

var dirname = path.dirname('/abc/pqr/xyz.txt');
console.log("Directory Name :",dirname);
