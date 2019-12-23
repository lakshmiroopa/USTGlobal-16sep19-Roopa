import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-request-book',
  templateUrl: './request-book.component.html',
  styleUrls: ['./request-book.component.css']
})
export class RequestBookComponent implements OnInit {

  constructor(private service: AuthService) {}

  ngOnInit() {
  }
  requestBook(form) {
    console.log(form.value);
    this.service.requestBook(form.value, form.value).subscribe(data => {
      console.log(data);
      alert('book requested');
    }, err => {
      console.log(err);
    }, () => {
      console.log('data requested sucessfully');
    });
  }


}
