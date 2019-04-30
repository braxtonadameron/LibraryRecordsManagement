import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { BookService } from '../book.service';
import { Book } from '../model/book';

@Component({
  selector: 'app-search-books',
  templateUrl: './search-books.component.html',
  styleUrls: ['./search-books.component.css']
})
export class SearchBooksComponent implements OnInit {
  searchForm = this.fb.group({
    title: ['']
  });

  books: Book[];
  title: string;

  constructor(
    private fb: FormBuilder,
    private bookService: BookService
  ) { }

  ngOnInit() {
    this.bookService.getBooks()
      .subscribe(b => this.books = b);
  }

  search() {
    this.title = this.searchForm.get('title').value;
    console.log(this.title);

    this.bookService.getByTitle(this.title)
      .subscribe(b => this.books = b);
  }
}
