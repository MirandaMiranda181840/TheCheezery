package miranda.miranda.thecheezery

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_productos.*
import kotlinx.android.synthetic.main.producto_view.view.*

class SaltiesActivity: AppCompatActivity() {

    var salties = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.salties_activity)

        cargarProductos()

        var adaptador = AdaptadorProductos(this, salties)
        listview.adapter = adaptador
    }

    fun cargarProductos(){
        salties.add(Product("Chicken crepes", R.drawable.chickencrepes, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6))
        salties.add(Product("Club Sandwich", R.drawable.clubsandwich, "A delicious sandwich served with french fries.", 5))
        salties.add(Product("Panini", R.drawable.hampanini, "Sandwich made with Italian bread  served warmed by grilling.", 4))
        salties.add(Product("Philly cheese steak", R.drawable. phillycheesesteak, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6))
        salties.add(Product("Nachos", R.drawable. nachos, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7))

    }

    private class AdaptadorProductos: BaseAdapter {
        var productos = ArrayList<Product>()
        var contexto: Context? = null

        constructor(contexto: Context, productos: ArrayList<Product>){
            this.contexto = contexto
            this.productos = productos
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod = productos[position]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)

            vista.producto_img.setImageResource(prod.image)
            vista.producto_nombre.setText(prod.name)
            vista.producto_desc.setText(prod.description)
            vista.producto_precio.setText("$${prod.price}")

            return vista
        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return productos.size
        }

    }

}
