import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { BookService } from '../book.service';
import { Book } from '../model/book';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {
  bookForm = this.fb.group({
    title: [''],
    author: [''],
    publisher: [''],
    isbn: [''],
    published: [''],
  });

  constructor(
    private fb: FormBuilder,
    private bookService: BookService
  ) { }

  ngOnInit() {
  }

  add() {
    const form = this.bookForm;
    const book = new Book();
    book.title = form.get('title').value;
    book.author = form.get('author').value;
    book.publisher = form.get('publisher').value;
    book.isbn = form.get('isbn').value;
    book.published = form.get('published').value;

    this.bookService.addBook(book)
      .subscribe();
  }
}
