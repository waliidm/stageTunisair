import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

  signIn(mat:String,mdp:String) {
    console.log("signIn");
    let headers = new HttpHeaders()
      .set('content-type', 'application/json')
      .set('Access-Control-Allow-Origin', '*')
      .set('Accept', '*/*');
      const body={username:mat,password:mdp};
    return this.http.post(`http://127.0.0.1:8082/api/auth/signin`,body, { 'headers': headers })
  }
}
