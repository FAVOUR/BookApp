package com.example.bookapp.database;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

/**
 * Created by Olije Favour on 9/17/2019.
 * Copyright (c) 2019    All rights reserved.
 */

// *Copyright (c) 2019  Itex Integrated Services  All rights reserved.

@Dao
public interface  UserDoa {

    @Query("select * from user")
     List<User> loadAllUsers();

    @Query("select * from user where :id")
    User loadUsersById(String id);

    @Query("select * from user where name =:firstName and lastName =:lastName")
    List<User> getLastName(String lastName, String firstName);

    @Query("select * from user where :age <= age")
    List<User> findUsersYoungerAge(int age);

    @Query("delete from user")
    void deleteAll();

}
