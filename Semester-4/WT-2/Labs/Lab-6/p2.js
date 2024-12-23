// Create a webapp with 5 pages like about, contact etc.. using “http” core module in NodeJS. (B)

const http = require('http');

const server = http.createServer((req,res)=>{
  if(req.url == '/'){
    res.write("Home Page");
  }
  else if(req.url == '/about'){
    res.write("About Page");
  } 
  else if(req.url == '/contact'){
    res.write("Contact Page");
  } 
  else if(req.url == '/blog'){
    res.write("About Page");
  }
  else if(req.url == '/service'){
    res.write("Service Page");
  }
  res.end();
})

server.listen(3001,()=>{
    console.log("Server is running on port 3001");
})