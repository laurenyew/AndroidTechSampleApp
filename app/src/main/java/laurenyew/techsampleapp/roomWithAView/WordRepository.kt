package laurenyew.techsampleapp.roomWithAView

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import laurenyew.techsampleapp.roomWithAView.data.Word
import laurenyew.techsampleapp.roomWithAView.data.WordDao

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}