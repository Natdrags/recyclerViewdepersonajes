package Christopher.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import Christopher.myapplication.adaptador.PersonajeAdapter
import Christopher.myapplication.modelo.Personaje

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonajes = ArrayList<Personaje>()

        listaPersonajes.add(Personaje("Tohru","https://p4.wallpaperbetter.com/wallpaper/678/219/820/anime-miss-kobayashi-s-dragon-maid-kobayashi-san-chi-no-maid-dragon-tohru-miss-kobayashi-s-dragon-maid-wallpaper-preview.jpg"))
        listaPersonajes.add(Personaje("Elma","https://images4.alphacoders.com/862/862781.png"))
        listaPersonajes.add(Personaje("Kanna Kamui","https://images5.alphacoders.com/815/815545.jpg"))
        listaPersonajes.add(Personaje("Quetzalcoatl","https://images4.alphacoders.com/107/1079041.png"))
        listaPersonajes.add(Personaje("Ilulu","https://www.anime-evo.net/wp-content/uploads/2021/09/KoMai2_12_7.jpg"))
        listaPersonajes.add(Personaje("Nino Nakanao","https://images4.alphacoders.com/122/1227848.jpg"))
        listaPersonajes.add(Personaje("Kobayashi","https://images5.alphacoders.com/838/838755.png"))




        miRecycler= findViewById(R.id.RecyclerPersonajes)

        miRecycler.adapter=PersonajeAdapter(listaPersonajes)
        miRecycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //GridLayoutManager
        //StaggeredGridLayoutManager


    }
}