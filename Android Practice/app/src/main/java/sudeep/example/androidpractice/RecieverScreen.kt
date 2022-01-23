package sudeep.example.androidpractice

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class RecieverScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reciever_screen)
        val getImage=findViewById<ImageView>(R.id.imageGet)
        val bundle:Bundle?=intent.extras
        val id=bundle?.get("img")
        getImage.setImageURI(id as Uri?)


    }
}