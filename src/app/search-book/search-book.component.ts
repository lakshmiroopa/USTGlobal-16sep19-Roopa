import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})
export class SearchBookComponent implements OnInit {
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
  deleteBook(book) {
    console.log(book);
    this.service.deleteBook(book.bid).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log('data deleted successfully');
    });
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
  selectUser(book) {
    console.log(book);
    this.selectedUser = book;
  }
  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.bid).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updated Successfully');
    });
}
  ngOnInit() {
  }

}
