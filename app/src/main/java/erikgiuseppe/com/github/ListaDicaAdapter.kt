package erikgiuseppe.com.github

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import erikgiuseppe.com.github.model.Dica

class ListaDicaAdapter(
    private val context: Context,
    private val produtos: List<Dica>
) : RecyclerView.Adapter<ListaDicaAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun vincula(dica: Dica) {
            val nome = itemView.findViewById<TextView>(R.id.titulo)
            nome.text = dica.titulo

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = dica.descricao
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaDicaAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.dica_item, parent, false)
        return ListaDicaAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(holder: ListaDicaAdapter.ViewHolder, position: Int) {
        val dica = produtos[position]
        holder.vincula(dica)
    }
}