package miranda.miranda.thecheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_combo.*

class DetalleCombo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_combo)

        var bundle = intent.extras

        if(bundle != null){
            detalle_nombre.setText(bundle.getString("nombre"))
            detalle_imagen.setImageResource(bundle.getInt("imagen"))
            detalle_descripcion.setText(bundle.getString("descripcion"))
        }
    }
}
