package com.example.bookapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

/**
 * Created by Olije Favour on 9/29/2019.
 * Copyright (c) 2019    All rights reserved.
 */


@Database(version = 1, entities = {Loan.class,Book.class,User.class})
@TypeConverters({DateConverter.class})
public abstract class BookLoanDb extends RoomDatabase {

    public static  BookLoanDb INSTANCE;

    public abstract BookDoa getBookDoa();

    public abstract  LoanDoa getLoanDoa();

    public abstract UserDoa getUserDoa();

            public static BookLoanDb getInstance(Context context){
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, BookLoanDb.class, "book_loan")
                            .build();
                }

                return INSTANCE;

            }







}
