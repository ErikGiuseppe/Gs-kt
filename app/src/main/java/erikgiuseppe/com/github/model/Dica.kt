package erikgiuseppe.com.github.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Dica(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val titulo: String,
    val descricao: String
)