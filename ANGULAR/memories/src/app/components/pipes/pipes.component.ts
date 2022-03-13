import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  text: string = "TestAnDo o PipE OperAtor";
  today = new Date();

  constructor() { }

  ngOnInit(): void {
  }

}
