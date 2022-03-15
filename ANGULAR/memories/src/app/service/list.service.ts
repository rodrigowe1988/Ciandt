import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Animal } from '../Animal';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ListService {
  private apiUrl = 'http://localhost:3000/animals';

  constructor(private http: HttpClient) { }

  remove(animals: Animal[], animal: Animal) {
    return animals.filter((a) => animal.name !== a.name);
  }

  getAll(): Observable<Animal[]> {
    return this.http.get<Animal[]>(this.apiUrl);
  }
}
