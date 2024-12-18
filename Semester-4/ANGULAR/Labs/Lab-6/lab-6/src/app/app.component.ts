import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'lab-6';

  temp=""

  display(e:any){
    this.temp=e.target.value
    console.log(e.target.value)
  }

  displayOnConsole(){
    console.log("Hello");
  }
}
