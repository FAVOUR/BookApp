package com.example.bookapp.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Olije Favour on 9/17/2019.
 * Copyright (c) 2019    All rights reserved.
 */

// *Copyright (c) 2019  Itex Integrated Services  All rights reserved.

@Entity
public class User {

   @PrimaryKey
    @NonNull
    public int id ;
    public String name;
    public String lastName ;
    public String age ;

}
