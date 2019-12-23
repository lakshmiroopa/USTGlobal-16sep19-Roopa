import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-search-book-student',
  templateUrl: './search-book-student.component.html',
  styleUrls: ['./search-book-student.component.css']
})
export class SearchBookStudentComponent implements OnInit {
  selectedUser;
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


