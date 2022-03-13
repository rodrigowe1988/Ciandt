import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eventos',
  templateUrl: './eventos.component.html',
  styleUrls: ['./eventos.component.css']
})
export class EventosComponent implements OnInit {
  show: boolean = false;
  showMessage(): void {
    this.show = !this.show;//toggle
    console.log("botao funciona")
  }

  constructor() { }

  ngOnInit(): void {
  }

}
