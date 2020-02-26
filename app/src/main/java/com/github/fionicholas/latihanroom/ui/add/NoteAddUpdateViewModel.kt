package com.github.fionicholas.latihanroom.ui.add

import android.app.Application
import androidx.lifecycle.ViewModel
import com.github.fionicholas.latihanroom.database.Note
import com.github.fionicholas.latihanroom.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)
    fun insert(note: Note) {
        mNoteRepository.insert(note)
    }
    fun update(note: Note) {
        mNoteRepository.update(note)
    }
    fun delete(note: Note) {
        mNoteRepository.delete(note)
    }
}