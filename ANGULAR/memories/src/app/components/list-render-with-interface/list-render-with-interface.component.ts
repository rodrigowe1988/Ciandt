import { Component, OnInit } from '@angular/core';

import { Animal } from 'src/app/Animal';

@Component({
  selector: 'app-list-render-with-interface',
  templateUrl: './list-render-with-interface.component.html',
  styleUrls: ['./list-render-with-interface.component.css']
})
export class ListRenderWithInterfaceComponent implements OnInit {

  animals: Animal [] = [
    {id: 1, name: "Turca", type: "Dog", age: 4},
    {id: 2, name: "Tom", type: "Cat", age: 10},
    {id: 3, name: "Nutella", type: "Dog", age: 6},
    {id: 4, name: "Nemo", type: "Fish", age: 1}
  ]

  animalDetails = '';

  constructor() { }

  ngOnInit(): void {
  }

  showAge(animal: Animal) {
    this.animalDetails = `O pet ${animal.name} tem ${animal.age} anos.`;
  }


}
