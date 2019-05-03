import { Component, OnInit } from '@angular/core';
import { faQuestionCircle, faUserCircle } from '@fortawesome/free-regular-svg-icons';
import { LoginService } from '../login.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {
  loginForm = this.fb.group({
    username: [''],
    password: ['']
  });

  faQuestionCircle = faQuestionCircle;
  faUserCircle = faUserCircle;
  loggedIn = false;
  username: string;

  constructor(private fb: FormBuilder
    , private loginService: LoginService
  ) { }

  ngOnInit() {
  }

  login() {
    this.username = this.loginForm.get('username').value;
    const password = this.loginForm.get('password').value;

    this.loginService.login(this.username, password)
      .subscribe(l => {
        this.loggedIn = l;
        this.loginService.loggedIn = l;
      });
  }

  logout() {
    this.loggedIn = false;
    this.username = null;
  }
}
