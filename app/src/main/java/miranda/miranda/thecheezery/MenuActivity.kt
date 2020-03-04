package miranda.miranda.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_colddrinks.setOnClickListener {
            var intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btn_hotdrinks.setOnClickListener {
            var intent = Intent(this, hotdrinks_activity::class.java)
            startActivity(intent)
        }

        btn_salties.setOnClickListener {
            var intent = Intent(this, SaltiesActivity::class.java)
            startActivity(intent)
        }

        btn_sweets.setOnClickListener {
            var intent = Intent(this, sweets_activity::class.java)
            startActivity(intent)
        }

    }
}





