package miranda.miranda.thecheezery

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_productos.*
import kotlinx.android.synthetic.main.producto_view.view.*

class sweets_activity: AppCompatActivity() {

    var sweets = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sweets_activity)

        cargarProductos()

        var adaptador = AdaptadorProductos(this, sweets)
        listview.adapter = adaptador
    }

    fun cargarProductos(){
        sweets.add(Product("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6))
        sweets.add(Product("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3))
        sweets.add(Product("Lemon tartalette", R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4))
        sweets.add(Product("Red Velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6))
        sweets.add(Product("Cherry cheesecake", R.drawable. strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7))
        sweets.add(Product("Tiramisu", R.drawable.tiramisu, "Coffee-flavored Italian dessert", 6))

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
