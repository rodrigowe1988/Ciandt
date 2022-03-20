import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  data: string = '00/00/0000';
  rico: number = 0;
  modal: number = 0;
  clear: number = 0;
  sicredi: number = 0;
  santander: number = 0;
  bradesco: number = 0;
  nubank: number = 0;

  constructor() { }

  ngOnInit(): void {
  }

  showVariables() {
    console.log(this.data, this.rico)
  }

}
