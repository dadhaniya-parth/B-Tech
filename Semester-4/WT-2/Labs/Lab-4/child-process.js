const cp = require('child_process');

cp.exec("dir",(err,stdout,stderr)=>{
    console.log(stdout);
})