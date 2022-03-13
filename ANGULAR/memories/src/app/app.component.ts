import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  userName = "Rodrigo";

  userData = {
    email: "rodrigo@email.com",
    role: "Admin"
  }

  handleClick() {
    console.log("fui clicado");
  }

  title = 'memories';
}
