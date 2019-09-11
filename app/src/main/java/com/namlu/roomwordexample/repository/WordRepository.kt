package com.namlu.roomwordexample.repository

import androidx.lifecycle.LiveData
import com.namlu.roomwordexample.dao.WordDao
import com.namlu.roomwordexample.entities.Word

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }

}