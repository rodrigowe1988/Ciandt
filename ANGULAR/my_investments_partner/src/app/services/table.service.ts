import { ConstantPool } from '@angular/compiler';
import { Injectable } from '@angular/core';

import { Conta } from '../Conta';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TableService {
  private apiUrl = 'http://localhost:3000/contas';

  constructor(private http: HttpClient) { }

  remove(contas: Conta[], conta: Conta) {
    return contas.filter((a) => conta.data !== a.data);
  }

  getAll(): Observable<Conta[]> {
    return this.http.get<Conta[]>(this.apiUrl);
  }
}
