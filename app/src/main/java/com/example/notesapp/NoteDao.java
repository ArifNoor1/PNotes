package com.example.notesapp;

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
    @Update
    void update(Note note);
    @Delete
    void delete(Note note);

    @Query("DELETE FROM table_name")
    void deleteAllNotes();

    @Query("SELECT * FROM table_name ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();
}
