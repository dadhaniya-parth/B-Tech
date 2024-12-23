// Demonstrate the use of EventEmmiter in NodeJS.

const EventEmmiter = require('events');

const event=new EventEmmiter();

event.on("videoUploaded",()=>{
    console.log("Notification Arrived");
});


// setInterval(() => {
//     event.emit("videoUploaded");
// }, 1000);

let i = 0;
while(i<5){
    event.emit("videoUploaded");
    i++;
}