package com.example.bookapp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

/**
 * Created by Olije Favour on 9/13/2019.
 * Copyright (c) 2019    All rights reserved.
 */

// *Copyright (c) 2019  Itex Integrated Services  All rights reserved.

@Dao
public interface BookDoa {

    @Query("SELECT * FROM Book")
    List<Book> getAllBooks();

    @Query("SELECT * FROM Book WHERE id = :id")
    List<Book> getBookByID(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     void addBook(Book book);
}
