import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';
import decode from 'jwt-decode';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(public jwtHelper: JwtHelperService) {}
  // ...
  public isAuthenticated(): boolean {

    const token = localStorage.getItem('token');
    // const token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxIiwiaWF0IjoxNjYyMDQxODA5LCJleHAiOjE2NjIxMjgyMDl9.qNUpLEAZ5D3FbdGzN_hHrieEPuDERJFFuctkBEhIgUg1GhCnTZqhOD5G02nTiCP-GvTLebgB0KwgJLnaqgwHxg";
    // const tokenPayload = decode(token);
    // console.log(tokenPayload['role']);
    // Check whether the token is expired and return
    // true or false
    return !this.jwtHelper.isTokenExpired(token);
  }
}