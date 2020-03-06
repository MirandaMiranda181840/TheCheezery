package miranda.miranda.thecheezery

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_combo.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.combo_view.view.*

class ComboActivity : AppCompatActivity() {

    var combos = ArrayList<Combo>()
    var adaptador: AdaptadorCombo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combo)

        cargarCombos()

        adaptador = AdaptadorCombo(this, combos)
        gridview.adapter = adaptador
    }


    fun cargarCombos(){
        combos.add(Combo("Ice Cream & Cookies", R.drawable.combo1icono,
            "¿Antojo de algo dulce? Ven con tu amigo y disfruta de este delicioso combo.\n" +"Dos helados chicos sabor Pay de Queso con Fresas junto con una galleta chewy clásica."))
        combos.add(Combo("Combo Sweet", R.drawable.combo2icono,
            "Tres galletas chewy clásicas y un vaso de leche para recordar los viejos tiempos.\n"+"Ven a The Chezzery y disfruta de este combo clásico."))
        combos.add(Combo("Combo Amigues", R.drawable.combo3icono,
            "¿Quieres ir al cine solo por las palomitas? No vayas tan lejos y disfruta de nuestro Combo Amigues.\n"+"Palomitas XL y dos sodas grandes (500ml)."))
        combos.add(Combo("Combo Nachos", R.drawable.combo4icono,
            " Para esas personas que les gusta comer clásico y sencillo, éste combo es para ustedes.\n" +"Nachos con queso y salsa de tomate, junto con una refrescante soda grande (500ml)."))
        combos.add(Combo("Best Sellers", R.drawable.combo5icono,
            "Disfruta lo popular de nuestro cafe, Frappé Mocha y Pie de Cerezas, la combinación más vendida en el 2019."))
        combos.add(Combo("The Simpsons", R.drawable.combo6icono,
            "¿Quieres desayunar como policia, sin ser un policia? Éste paquete es para ti.\n"+"Un café americano caliente (250ml) junto con una dona glaseada de fresa."))
    }

    class AdaptadorCombo:BaseAdapter {

        var combos = ArrayList<Combo>()
        var contexto: Context? = null

        constructor(contexto:Context, combos:ArrayList<Combo>){
            this.combos = combos;
            this.contexto = contexto;
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var combo = combos[position]
            var inflater = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)  as LayoutInflater
            var vista = inflater.inflate(R.layout.combo_view, null)

            vista.combo_img.setImageResource(combo.imagen)
            vista.combo_nombre.setText(combo.nombre)

            vista.combo_img.setOnClickListener{
                var intent = Intent(contexto, DetalleCombo::class.java)
                intent.putExtra("nombre", combo.nombre)
                intent.putExtra("descripcion", combo.descripcion)
                intent.putExtra("imagen", combo.imagen)
                contexto?.startActivity(intent)
            }

            return vista

        }

        override fun getItem(position: Int): Any {
            return combos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return combos.size
        }

    }

}
