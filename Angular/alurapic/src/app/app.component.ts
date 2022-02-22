import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

interface Array{
  url: string;
  description:string;
}
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'alurapic';

  photos:Array[] = [];

  constructor(http: HttpClient){

    http
    .get<Array[]>('http://localhost:3000/flavio/photos')
    .subscribe(photos => this.photos = photos);

  }

}
