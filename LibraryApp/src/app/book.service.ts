import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Book } from './model/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {
  constructor(private http: HttpClient) { }

  getBooks() {
    return this.http
      .get<Book[]>('/books');
  }

  getByTitle(title: string) {
    return this.http
      .get<Book[]>('/books?title=' + title);
  }

  addBook(book: Book) {
    return this.http
      .post<Boolean>('/book', book);
  }
}
