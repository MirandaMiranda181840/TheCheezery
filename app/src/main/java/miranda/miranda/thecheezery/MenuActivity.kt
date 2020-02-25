package miranda.miranda.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_coldDrinks.setOnClickListener{
            //setContentView(R.layout.activity_registro)
            var intent = Intent(this, ColdDrinks::class.java)
            startActivity(intent)
        }

        btn_hotDrinks.setOnClickListener{
            //setContentView(R.layout.activity_registro)
            var intent = Intent(this, HotDrinks::class.java)
            startActivity(intent)
        }

        btn_sweets.setOnClickListener{
            //setContentView(R.layout.activity_registro)
            var intent = Intent(this, Sweets::class.java)
            startActivity(intent)
        }

        btn_salties.setOnClickListener{
            //setContentView(R.layout.activity_registro)
            var intent = Intent(this, Salties::class.java)
            startActivity(intent)
        }

        btn_combos.setOnClickListener{
            //setContentView(R.layout.activity_registro)
            var intent = Intent(this, Combos::class.java)
            startActivity(intent)
        }

        btn_personalized.setOnClickListener{
            //setContentView(R.layout.activity_registro)
            var intent = Intent(this, Personalized::class.java)
            startActivity(intent)
        }


    }




}
