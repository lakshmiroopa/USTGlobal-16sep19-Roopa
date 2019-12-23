import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LibrarypageComponent } from './librarypage/librarypage.component';
import { RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { RegisterComponent } from './register/register.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddBookComponent } from './add-book/add-book.component';
import { HomeComponent } from './home/home.component';
import { DisplayBookComponent } from './display-book/display-book.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { RequestBookComponent } from './request-book/request-book.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { FilterPipe } from './filter.pipe';
import { SearchBookStudentComponent } from './search-book-student/search-book-student.component';
import { DisplayBookStudentComponent } from './display-book-student/display-book-student.component';


@NgModule({
  declarations: [
    AppComponent,
    LibrarypageComponent,
    LoginComponent,
    HeaderComponent,
    RegisterComponent,
    AddBookComponent,
    HomeComponent,
    DisplayBookComponent,
    SearchBookComponent,
    RequestBookComponent,
    LibrarianComponent,
    FilterPipe,
    SearchBookStudentComponent,
    DisplayBookStudentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'header', component: HeaderComponent },
      { path: 'library', component: LibrarypageComponent },
      { path: 'login', component: LoginComponent },
      { path: 'signup', component: RegisterComponent },
      { path: 'add-book', component: AddBookComponent },
      { path: 'home', component: HomeComponent },
      { path: 'librarian', component: LibrarianComponent },
      { path: 'display-book', component: DisplayBookComponent },
      { path: 'search-book', component: SearchBookComponent },
      { path: 'search-book-student', component: SearchBookStudentComponent },
      { path: 'display-book-student', component: DisplayBookStudentComponent },
      { path: 'request-book', component: RequestBookComponent },

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
