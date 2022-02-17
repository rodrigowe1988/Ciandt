import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
//import { url } from 'inspector';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  photos = [];

  constructor(http: HttpClient) {
    console.log(http)
  }
}
