package Christopher.myapplication.adaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import Christopher.myapplication.R
import Christopher.myapplication.modelo.Personaje
import com.squareup.picasso.Picasso

class PersonajeAdapter(val listaPersonajes:ArrayList<Personaje>): RecyclerView.Adapter<PersonajeAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.vista_propia,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNombre.text=listaPersonajes[position].nombre
        Picasso.get()
            .load(listaPersonajes[position].foto)
            .into(holder.ivFoto)
    }

    override fun getItemCount(): Int {
        return listaPersonajes.size
    }

    class ViewHolder(vista:View):RecyclerView.ViewHolder(vista){
        val tvNombre:TextView
        val ivFoto:ImageView

        init {
            tvNombre = vista.findViewById(R.id.tvNombreP)
            ivFoto = vista.findViewById(R.id.imaPersonaje)
        }
    }
}