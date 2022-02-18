import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PhotoService } from './photos/photo/photo.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  /* 
  photos = [
    { 
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Sultan_the_Barbary_Lion.jpg/440px-Sultan_the_Barbary_Lion.jpg', 
      description: 'Leão'
    },
    { 
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Lioness_Etosha_NP.jpg/500px-Lioness_Etosha_NP.jpg', 
      description: 'Leoa'
    },
    { 
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Lioness_Etosha_NP.jpg/500px-Lioness_Etosha_NP.jpg', 
      description: 'Leoa'
    }         
  ];
  */  

  /*
    photos: Object[] = [];
    
    constructor(http: HttpClient) {
      
      http
        .get<Object[]>('http://localhost:3000/flavio/photos')
        .subscribe(
          photos => this.photos = photos,
          err => console.log(err.message)     
        );           
    }
    */

    photos: Object[] = [];

    constructor(photoService: PhotoService) {

      photoService
        .listFromUser('flavio')
        .subscribe(photos => this.photos = photos)
    }
}