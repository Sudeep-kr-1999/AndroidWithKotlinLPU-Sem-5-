package sudeep.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
class ImageView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)
        val monkey = findViewById<ImageView>(R.id.monkey)
        val and = findViewById<ImageView>(R.id.android)

        monkey.setOnClickListener {
            Toast.makeText(applicationContext,"Image View!, Monkey",Toast.LENGTH_LONG).show()
        }

        and.setOnClickListener {
            Toast.makeText(applicationContext,"Image View!, Android",Toast.LENGTH_LONG).show()
        }
    }
}