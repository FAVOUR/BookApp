package com.example.bookapp.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import java.util.Date;

/**
 * Created by Olije Favour on 9/19/2019.
 * Copyright (c) 2019    All rights reserved.
 */


@Entity(foreignKeys = {
        @ForeignKey(entity = User.class,
                parentColumns ="id",
                childColumns = "user_id"),

        @ForeignKey(entity=Book.class,
                    parentColumns = "id",
                    childColumns = "book_id") })
public class Loan {

    //Fields should be public if private use getters and setters

    public int id;

    public Date startDate;

    public Date endDate;

    @ColumnInfo(name="user_id")
    public int userId;

    @ColumnInfo(name="book_id")
    public int bookId;


}
