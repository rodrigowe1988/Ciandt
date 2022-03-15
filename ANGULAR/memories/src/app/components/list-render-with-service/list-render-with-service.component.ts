import { Component, OnInit } from '@angular/core';

import { Animal } from 'src/app/Animal';

import { ListService } from 'src/app/service/list.service';

@Component({
  selector: 'app-list-render-with-service',
  templateUrl: './list-render-with-service.component.html',
  styleUrls: ['./list-render-with-service.component.css']
})
export class ListRenderWithServiceComponent implements OnInit {

  animals: Animal[] = [];

  animalDetails = '';

  constructor(private listService: ListService) {
    this.getAnimals();
  }

  ngOnInit(): void {
  }

  showAge(animal: Animal): void {
    this.animalDetails = `O pet ${animal.name} tem ${animal.age}.`
  }

  removeAnimal(animal: Animal) {
    console.log("removendo animal...")
    this.animals = this.listService.remove(this.animals, animal);
  }

  getAnimals(): void {
    this.listService.getAll().subscribe((animals) => (this.animals = animals));
  }

}
