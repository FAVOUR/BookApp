package com.example.bookapp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookapp.R;
import com.example.bookapp.database.Book;

import java.util.List;

/**
 * Created by Olije Favour on 10/9/2019.
 * Copyright (c) 2019    All rights reserved.
 */

// *Copyright (c) 2019  Itex Integrated Services  All rights reserved.


public class BookRv extends RecyclerView.Adapter<BookRv.BookViewHolder> {

   Context context ;

    List<Book> book ;

    public BookRv(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  =LayoutInflater.from(context).inflate(R.layout.content_books,parent,false);

        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {


//        Log.d("Book id     <>>>>> ", String.valueOf(book.get(position).id));
//
//
//        Log.d("Book title    <>>>>> ", String.valueOf(book.get(position).title));

        holder.bookNumberTitle.setText(book.get(position).title);
        holder.bookNumberId.setText(String.valueOf(book.get(position).id));

    }

    @Override
    public int getItemCount() {
        int allBooks = 0;

        if( book != null ) {
//            Log.d("Book size    <>>>>> ", String.valueOf(book.size()));

            allBooks = book.size();
        }

//        Log.d("Book size before returning the value    <>>>>> ", String.valueOf(allBooks));

        return allBooks;
    }

    public void setBook(List<Book> book) {
        this.book = book;
        notifyDataSetChanged();
    }

    class BookViewHolder extends RecyclerView.ViewHolder {
        TextView bookNumberId;

        TextView bookNumberTitle;


        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

//            Log.d("ViewHolder   <>>>>> ","Assigning views ");


            bookNumberId= itemView.findViewById(R.id.book_number);
             bookNumberTitle= itemView.findViewById(R.id.book_title);


        }

    }

}
