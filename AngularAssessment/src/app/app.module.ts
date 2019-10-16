import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { MoviesComponent } from './movies/movies.component';
import { LoginComponent } from './login/login.component';
import { AddComponent } from './add/add.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MoviesComponent,
    LoginComponent,
    AddComponent,
  ],
  imports: [
      BrowserModule,
      FormsModule, 
      RouterModule,
      HttpClientModule,
      RouterModule.forRoot([
      {path: 'movies', component: MoviesComponent},
      {path: 'addmovies', component: AddComponent},
      {path: 'login', component: LoginComponent}

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
