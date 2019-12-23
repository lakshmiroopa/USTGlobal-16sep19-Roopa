import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isLLoggedIn = false;
  isSLoggedIn = false;

  constructor(private http: HttpClient) { }
  baseURL = 'http://localhost:8080';
  register(user): Observable<any> {
    return this.http.post('http://localhost:8080/librarymanagement/register', user);
  }
  login(user): Observable<any> {
    return this.http.post('http://localhost:8080/librarymanagement/login', user);
  }
  addBooks(user): Observable<any> {
    return this.http.post('http://localhost:8080/librarymanagement/add-books', user);
  }
  deleteBook(bid): Observable<any> {
    return this.http.delete(`${'http://localhost:8080/librarymanagement/delete-book'}/${bid}`);
  }
  updateUser( data): Observable<any> {
    return this.http.put('http://localhost:8080/librarymanagement/update', data);
  }
  requestBook(id, bid): Observable<any> {
    return this.http.get(`${'http://localhost:8080/librarymanagement/requestBook'}/${id}/${bid}`);
  }
  isLibrarianLoggedIn() {
    if (this.isLLoggedIn) {
      return true;
    }
    return false;
  }

  isStudentLoggedIn() {
    if (this.isSLoggedIn) {
      return true;
    }
    return false;
  }
}
