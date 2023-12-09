package com.example.digitaldiary.listeners;

import com.example.digitaldiary.entities.Note;

public interface NotesListener {
    void onNoteCLicked(Note note, int position);
}
