package erikgiuseppe.com.github

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import erikgiuseppe.com.github.model.Dica

@Dao
interface DicaDao {
    @Query("SELECT * FROM Dica")
    fun getAll(): LiveData<List<Dica>>
    @Insert
    fun insert(item: Dica)
    @Delete
    fun delete(item: Dica)
}