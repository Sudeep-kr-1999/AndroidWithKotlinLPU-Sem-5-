package sudeep.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertDialogExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog_example)
        val btnAlert=findViewById<Button>(R.id.button4)
        btnAlert.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Login Alert").setMessage("Are you sure , you want to Continue?").setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes"){
                dialogInterface,which->
                    Toast.makeText(applicationContext,"cliked Yes",Toast.LENGTH_LONG).show()
            }

            builder.setNeutralButton("Cancel"){
                    dialogInterface,which->
                Toast.makeText(applicationContext,"cliked Cancel\nOperation Cancel",Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No"){
                    dialogInterface,which->
                Toast.makeText(applicationContext,"cliked No",Toast.LENGTH_LONG).show()
            }

            val alertDialog:AlertDialog=builder.create()
            alertDialog.show()

        }
    }
}