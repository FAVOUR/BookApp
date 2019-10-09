package com.example.bookapp.database;

import androidx.room.TypeConverter;

import java.util.Date;

/**
 * Created by Olije Favour on 10/8/2019.
 * Copyright (c) 2019    All rights reserved.
 */



public class DateConverter {

    @TypeConverter
    public Date toDate(Long timeInMilliseconds){
      return  timeInMilliseconds !=null  ? new Date(timeInMilliseconds) :null;
    }


    @TypeConverter
    public Long toLong (Date date ){

        return date !=null ? date.getTime() :null;
    }
}
