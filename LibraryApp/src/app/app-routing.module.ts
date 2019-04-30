import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LibraryCardComponent } from './library-card/library-card.component';
import { SearchBooksComponent } from './search-books/search-books.component';
import { AddBookComponent } from './add-book/add-book.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'library-card', component: LibraryCardComponent },
  { path: 'search-books', component: SearchBooksComponent },
  { path: 'add-book', component: AddBookComponent },
  { path: '*', component: HomeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
