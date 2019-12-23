import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private service: AuthService) { }

  ngOnInit() {
  }
  UpdateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data update sucessfully');
    });

  }

}
