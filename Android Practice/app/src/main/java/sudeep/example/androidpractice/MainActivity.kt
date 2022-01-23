package sudeep.example.androidpractice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    lateinit var  imageUri:Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageV = findViewById<ImageView>(R.id.imageV)
        val btnSelect = findViewById<Button>(R.id.BtnSelect)
        val btnSend=findViewById<Button>(R.id.BtnSend)

        val getImage = registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                imageUri=it
                imageV.setImageURI(it)
            }
        )
        btnSelect.setOnClickListener {
            getImage.launch("image/*")
        }

        btnSend.setOnClickListener {
            val intent=Intent(this,RecieverScreen::class.java)
            intent.putExtra("img",imageUri)
            startActivity(intent)
        }
    }
}