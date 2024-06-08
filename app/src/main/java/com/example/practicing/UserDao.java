package com.example.practicing;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM Users_table")
    List<User> getAll();

    @Insert
    void insertAll(User... users);
}


