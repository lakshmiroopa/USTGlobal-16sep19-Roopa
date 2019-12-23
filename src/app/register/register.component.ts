import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { format } from 'url';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  constructor(private auth: AuthService, private router: Router) { }
  register(form: NgForm) {
    this.auth.register(form.value).subscribe(response => {
      console.log('response of register', response);
      if (response !== 0) {
        alert('Registration successful');
        this.router.navigateByUrl('/login');
      }
      form.reset();
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }
}
