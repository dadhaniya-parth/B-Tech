// 1. Perform basic interpolation (A)
// 2. Perform interpolation with pipes (A)
// 3. Demonstrate property binding in Angular (A)

import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'lab5';

  stuData = {
    "id":1,
    "name":"Parth Patel",
    "age":20,
    "rollno":563
  };

  d = new Date();

  number = 8.3

  practiceNumber = 9876543.219
}