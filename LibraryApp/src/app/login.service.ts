import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  loggedIn = false;

  constructor(private http: HttpClient) { }

  login(username: string, password: string) {
    return this.http
      .get<boolean>('/login?username=' + username + '&password=' + password);
  }
}
