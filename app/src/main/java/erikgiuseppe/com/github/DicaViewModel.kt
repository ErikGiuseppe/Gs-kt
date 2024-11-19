package erikgiuseppe.com.github

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import erikgiuseppe.com.github.model.Dica
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class DicaViewModel(application: Application) : AndroidViewModel(application) {

    private val dicaDao: DicaDao
    val dicasLiveData: LiveData<List<Dica>>

    init {
        val database = Room.databaseBuilder(
            getApplication(),
            ItemDatabase::class.java,
            "dicas_database"
        ).build()

        dicaDao = database.dicaDao()
        dicasLiveData = dicaDao.getAll()
    }

    fun addItem(title: String,description: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val newItem = Dica(titulo = title, descricao = description)
            dicaDao.insert(newItem)
        }
    }

    fun removeItem(dica: Dica) {
        viewModelScope.launch(Dispatchers.IO) {
            dicaDao.delete(dica)
        }
    }
}