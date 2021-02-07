package app.motsu.hiromoto.lesson

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import coil.api.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

        }

        val url = "https://hiyokoyarou.com/wp-content/uploads/2017/04/iconpittari.png"
        val imageView = findViewById<ImageView>(R.id.imageView2)
        imageView.load(url)
    }

    fun clickButton(view: View){
        textView.text = "Clicked！"
        textView.setTextColor(Color.rgb(200,60,80))
    }
}