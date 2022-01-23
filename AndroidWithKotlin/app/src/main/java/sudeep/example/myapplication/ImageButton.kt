package sudeep.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast


class ImageButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)
        val fb = findViewById<ImageButton>(R.id.img1)
        val insta = findViewById<ImageButton>(R.id.img2)
        val whatsapp = findViewById<ImageButton>(R.id.img3)

        fb.setOnClickListener {
            Toast.makeText(applicationContext,"Facebook",Toast.LENGTH_LONG).show()
        }

        insta.setOnClickListener {
            Toast.makeText(applicationContext,"Instagram",Toast.LENGTH_LONG).show()
        }

        whatsapp.setOnClickListener {
            Toast.makeText(applicationContext,"Whatsapp",Toast.LENGTH_LONG).show()
        }
    }
}