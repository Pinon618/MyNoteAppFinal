package com.example.mynoteapp;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {
    @Insert
    void insert(Note note);

    @Query("SELECT * FROM notes ORDER BY timestamp DESC")
    LiveData<List<Note>> getAllNotes();

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);
}
