package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bookapp.adapter.BookRv;
import com.example.bookapp.database.Book;
import com.example.bookapp.model.repository.BookRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    BookRepository bookRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=new RecyclerView(this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);


        bookRepository=new BookRepository(getApplication());


        final BookRv bookRv = new BookRv(this);



        bookRepository.getAllBooks().observe(this, new Observer<List<Book>>() {
            @Override
            public void onChanged(List<Book> books) {
                bookRv.setBook(books);
            }
        });


    }
}
