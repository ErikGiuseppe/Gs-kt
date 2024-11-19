package erikgiuseppe.com.github

import androidx.room.Database
import androidx.room.RoomDatabase
import erikgiuseppe.com.github.model.Dica

@Database(entities = [Dica::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun dicaDao(): DicaDao
}