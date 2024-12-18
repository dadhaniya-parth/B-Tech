// Create a webapp in NodeJS which reads 􀆒les like about.txt, contact.txt and display it using http core module. (C)

const fs = require('fs');

const http = require('http');

const server = http.createServer((req,res)=>{
    res.setHeader('Content-Type','text/html');
    if(req.url == '/'){
        data = fs.readFileSync('home.html','utf8');
        res.end(data);
    }
    if(req.url == '/about'){
        data = fs.readFileSync('about.html','utf8');
        res.end(data);
    }
    if(req.url == '/contact'){
        data = fs.readFileSync('contact.html','utf8');
        res.end(data);
    }
    if(req.url == '/service'){
        data = fs.readFileSync('service.html','utf8');
        res.end(data);
    }
    if(req.url == '/blog'){
        data = fs.readFileSync('blog.html','utf8');
        res.end(data);
    }
})

server.listen(3002,()=>{
    console.log("Server is running on port 3002");
})