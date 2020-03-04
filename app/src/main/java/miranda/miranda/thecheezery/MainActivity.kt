package miranda.miranda.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Código para iniciar otra activity
        btn_getstarted.setOnClickListener {
            var intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        //var prueba: Intent? = null


    }
}
