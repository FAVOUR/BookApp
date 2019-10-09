package com.example.bookapp.database;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

/**
 * Created by Olije Favour on 9/20/2019.
 * Copyright (c) 2019
 * All rights reserved.
 */


@Dao
public interface LoanDoa {

    @Query("SELECT * from loan where user_id = :id")
     public Loan bookLoanedByUser(int id);

    @Query("select * from loan ")
    public List<Loan>allBooksOnLoan();

    @Query("SELECT * from loan where book_id = :id")
    public Loan bookLoanedByBook(int id);


}
