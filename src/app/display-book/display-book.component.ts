import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-display-book',
  templateUrl: './display-book.component.html',
  styleUrls: ['./display-book.component.css']
})
export class DisplayBookComponent implements OnInit {
  books: any;
  constructor(private http: HttpClient, private service: AuthService) {
    this.getData();
  }
  getData() {
    this.http.get<any>('http://localhost:8080/librarymanagement/show-books').subscribe(data => {
      console.log(data);
      this.books = data.booksDetails;
    });
  }

  ngOnInit() {
  }

}
