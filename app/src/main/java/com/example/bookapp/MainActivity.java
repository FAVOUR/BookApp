package com.example.bookapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.bookapp.adapter.BookRv;
import com.example.bookapp.addbooks.activity.AddBookActivity;
import com.example.bookapp.database.Book;
import com.example.bookapp.model.repository.BookRepository;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    BookRepository bookRepository;

    FloatingActionButton floatingActionButton;

    public static final int NEW_BOOK_INTENT =123 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton= findViewById(R.id.fab_button);

        RecyclerView recyclerView=findViewById(R.id.book_rv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        final BookRv bookRv = new BookRv(this);


        recyclerView.setAdapter(bookRv);

        recyclerView.setLayoutManager(layoutManager);




        bookRepository=new BookRepository(getApplication());






        bookRepository.getAllBooks().observe(this, new Observer<List<Book>>() {
            @Override
            public void onChanged(List<Book> books) {

//                Log.d("Word >>>" , new Gson().toJson( books));
                bookRv.setBook(books);
            }
        });



        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent  = new Intent(getApplicationContext(), AddBookActivity.class);

                startActivityForResult(intent,NEW_BOOK_INTENT);
            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){

            if(requestCode == NEW_BOOK_INTENT){

            }

        }else{
            Toast.makeText(getBaseContext(),"Data not saved",Toast.LENGTH_SHORT).show();
        }
    }
}
