package com.example.bookapp.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Olije Favour on 9/13/2019.
 * Copyright (c) 2019    All rights reserved.
 */

// *Copyright (c) 2019  Itex Integrated Services  All rights reserved.

@Entity
public class Book {

    @PrimaryKey
    public int id;

    public String title;
}
