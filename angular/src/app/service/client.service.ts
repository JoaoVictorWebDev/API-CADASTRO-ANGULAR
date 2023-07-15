import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import { Client } from '../model/Client';

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  
  private url:string = 'http://localhost:8080';

  constructor(private http:HttpClient) {}
  
 selecionar():Observable<Client[]>{
  return this.http.get<Client[]>(this.url)
 }
 
cadastrar(obj:Client):Observable<Client>{
  return this.http.post<Client>(this.url, obj)
}
editar(obj:Client):Observable<Client>{
  return this.http.put< Client>(this.url, obj)
}
remover(idCliente:number):Observable<void>{
  return this.http.delete<void>(this.url + '/' + idCliente);
}

}
