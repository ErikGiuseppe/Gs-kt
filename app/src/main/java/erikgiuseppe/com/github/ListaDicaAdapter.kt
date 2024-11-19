package erikgiuseppe.com.github

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import erikgiuseppe.com.github.model.Dica

class ListaDicaAdapter(private val onItemRemoved: (Dica) -> Unit) :
    RecyclerView.Adapter<ListaDicaAdapter.ItemViewHolder>() {

    private var items = listOf<Dica>()

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.titulo)
        val button = view.findViewById<ImageButton>(R.id.imageButton)

        fun bind(item: Dica) {
            textView.text = item.titulo
            textView.text = item.descricao
            button.setOnClickListener {
                onItemRemoved(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dica_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    fun updateDicas(newItems: List<Dica>) {
        items = newItems
        notifyDataSetChanged()
    }
}