package sudeep.example.androidpractice

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat

class ImagePickerWithPermission : AppCompatActivity() {
    private lateinit var requestStorage:ActivityResultLauncher<String>
    private lateinit var getImage :ActivityResultLauncher<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_picker_with_permission)
        val imageV = findViewById<ImageView>(R.id.imageV)
        val btnSelect = findViewById<Button>(R.id.BtnSelect)

        requestStorage = registerForActivityResult(ActivityResultContracts.RequestPermission())
        {
            if(it) {
                Toast.makeText(applicationContext, "Permission Granted", Toast.LENGTH_LONG).show()
                storageCall()
            }
            else
                Toast.makeText(applicationContext,"Permission Denied", Toast.LENGTH_LONG).show()
        }

        getImage = registerForActivityResult(
                ActivityResultContracts.GetContent(),
                ActivityResultCallback {
                    imageV.setImageURI(it)
                }
        )
        btnSelect.setOnClickListener {
            callStoragePermission();
        }
    }


    private fun storageCall()
    {
        getImage.launch("image/*")
    }

    private fun callStoragePermission()
    {
        when {
            ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED -> {
                Toast.makeText(applicationContext,"Permission Granted Already", Toast.LENGTH_LONG).show()
                storageCall();

            }
            else ->
            {
                requestStorage.launch(android.Manifest.permission.READ_EXTERNAL_STORAGE)
            }

        }
    }
}