package com.example.bookapp.model.repository;

import android.app.Application;
import android.os.AsyncTask;

import com.example.bookapp.database.Book;
import com.example.bookapp.database.BookDoa;
import com.example.bookapp.database.BookLoanDb;

import java.util.List;

/**
 * Created by Olije Favour on 10/4/2019.
 * Copyright (c) 2019    All rights reserved.
 */



public class BookRepository {

   BookLoanDb bookLoanDb ;
   BookDoa bookDoa;
   Book books;
   List<Book> booksInStore;


    BookRepository(Application application){

        bookLoanDb =BookLoanDb.getInstance(application);
        bookDoa=bookLoanDb.getBookDoa();
        booksInStore=bookDoa.getAllBooks();



    }



    public List<Book>  getAllBooks(){
        return booksInStore;
    }

    public Book getBookById(int BookId){
        return books;
    }

    public void addBook(Book book){

        new BookAsync(bookDoa).execute(book);
    }

    class BookAsync extends AsyncTask<Book,Void,Void>{
       BookDoa bookDoa;

        BookAsync (BookDoa bookDoa){
            this.bookDoa=bookDoa;
        }


        @Override
        protected Void doInBackground(Book... books) {

            bookDoa.addBook(books[0]);
            return null;
        }
    }

}
