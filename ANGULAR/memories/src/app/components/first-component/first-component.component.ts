import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first-component',
  templateUrl: './first-component.component.html',
  styleUrls: ['./first-component.component.css']
})
export class FirstComponentComponent implements OnInit {

  name: string = "Rodrigo";
  age: number = 34;
  job: string = "Programador";
  hobbies: string[] = ['Musculação', 'Yoga', 'Estudar'];
  laptop : {name: string, year: number, model: string} = {
    name: "Macbook Pro",
    year: 2013,
    model: "A1502",
  }

  constructor() { }

  ngOnInit(): void {
  }

}
