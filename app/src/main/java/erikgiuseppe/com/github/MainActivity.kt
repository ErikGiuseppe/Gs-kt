package erikgiuseppe.com.github

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import erikgiuseppe.com.github.model.Dica
import erikgiuseppe.com.github.ui.theme.EcoDicasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiy_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaDicaAdapter(
            context = this,
            produtos = listOf(
                Dica("Teste 0", "Teste Descrição 0" ),
                Dica("Teste 1", "Teste Descrição 1" ),
                Dica("Teste 2", "Teste Descrição 2"),
            )
        )

    }


}