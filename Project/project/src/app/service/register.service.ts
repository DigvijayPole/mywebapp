import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './config';
@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http:HttpClient) { }

  public addUser(user:any){
    return this.http.post(`${baseUrl}/user`,user);
  }
}
