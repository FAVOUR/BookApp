package com.example.bookapp.database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/**
 * Created by Olije Favour on 9/13/2019.
 * Copyright (c) 2019    All rights reserved.
 */

// *Copyright (c) 2019  Itex Integrated Services  All rights reserved.

@Entity(indices ={@Index("id")})
public class Book {

    @PrimaryKey(autoGenerate =true)
    public int id;

    public String title;

    @Ignore
    public Book(String title) {
        this.title = title;
    }

    public Book(int id, String title) {
        this.id =id ;
        this.title = title;
    }
}
