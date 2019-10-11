package com.example.bookapp.addbooks.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bookapp.R;
import com.example.bookapp.database.Book;
import com.example.bookapp.model.repository.BookRepository;

public class AddBookActivity extends AppCompatActivity {

    EditText bookEditText;
    Button addBookButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        bookEditText=findViewById(R.id.book_title);
        addBookButton =findViewById(R.id.add_book_btn);



        addBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               BookRepository bookRepository = new BookRepository(getApplication());

               bookRepository.addBook( new Book(bookEditText.getText().toString()));

                   setResult(RESULT_OK);
               finish();

            }
        });


    }
}
