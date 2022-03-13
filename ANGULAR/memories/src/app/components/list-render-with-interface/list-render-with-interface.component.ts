import { Component, OnInit } from '@angular/core';

import { Animal } from 'src/app/Animal';

@Component({
  selector: 'app-list-render-with-interface',
  templateUrl: './list-render-with-interface.component.html',
  styleUrls: ['./list-render-with-interface.component.css']
})
export class ListRenderWithInterfaceComponent implements OnInit {

  animals: Animal [] = [
    {name: "Turca", type: "Dog", age: 4},
    {name: "Tom", type: "Cat", age: 10},
    {name: "Nutella", type: "Dog", age: 6},
    {name: "Nemo", type: "Fish", age: 1}
  ]

  animal: Animal = {
    name: 'Teste',
    type: 'Alguma coisa',
    age: 7
  }

  animalDetails = '';

  constructor() { }

  ngOnInit(): void {
  }

  showAge(animal: Animal) {
    this.animalDetails = `O pet ${animal.name} tem ${animal.age} anos.`;
  }

  
}
