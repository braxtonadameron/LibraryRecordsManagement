import { Component, OnInit } from '@angular/core';
import { faQuestionCircle, faUserCircle } from '@fortawesome/free-regular-svg-icons';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {
  faQuestionCircle = faQuestionCircle;
  faUserCircle = faUserCircle;

  constructor() { }

  ngOnInit() {
  }

}
