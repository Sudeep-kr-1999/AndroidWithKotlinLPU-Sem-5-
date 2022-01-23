package sudeep.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import java.util.*
import kotlin.collections.ArrayList

class CustomAlertDialogExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog_example)
        val btnSimpleAlert = findViewById<Button>(R.id.btnSimpleAlert)
        val btnAlertWithItems = findViewById<Button>(R.id.btnAlertWithItems)
        val btnAlertwithMultiChoiceItems = findViewById<Button>(R.id.btnAlertWithMultiChoiceItems)
        val btnAlertWithEditText = findViewById<Button>(R.id.btnAlertWithEditText)
        btnSimpleAlert.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Simple Alert").setMessage("We have a Message").setPositiveButton("OK") { dialog, which ->
                Toast.makeText(applicationContext, "OK was Clicked", Toast.LENGTH_LONG).show()
            }.setNegativeButton("No") { dialog, which ->
                Toast.makeText(applicationContext, "No was Clicked", Toast.LENGTH_LONG).show()
            }.setCancelable(false).show()


        }

        btnAlertWithItems.setOnClickListener {
            val items = arrayOf("Apple", "Banana", "Orange", "Grapes")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("List of items").setItems(items) { dialog, which ->
                Toast.makeText(applicationContext, items[which] + "isClicked", Toast.LENGTH_SHORT).show()
            }
                    .setPositiveButton("OK", null)
                    .setNegativeButton("CANCEL", null)
                    .setNeutralButton("NEUTRAL", null)
            var alertDialog = builder.create()
            alertDialog.show()
            val button = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
            val buttonN = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE)
            button.setBackgroundColor(Color.RED)
            buttonN.setBackgroundColor(Color.BLACK)

            button.setPadding(0, 0, 20, 0)
            buttonN.setPadding(20, 0, 20, 0)
            button.setTextColor(Color.WHITE)
            buttonN.setTextColor(Color.BLUE)
        }

        btnAlertwithMultiChoiceItems.setOnClickListener {
            val items = arrayOf("Apple", "Banana", "Orange", "Grapes")
            val selectedList = ArrayList<String>()
            val builder = AlertDialog.Builder(this)

                    .setTitle("This is Multi Choice")
                    .setMultiChoiceItems(items, null) { dialog, which, isChecked ->
                        if (isChecked)
                            selectedList.add(items[which])
                        else if (selectedList.contains(items[which]))
                            selectedList.remove(items[which])
                    }
                    .setPositiveButton("Done") { dialog, i ->
                        Toast.makeText(applicationContext, "items selected are: " + Arrays.toString(selectedList.toTypedArray()),
                                Toast.LENGTH_LONG).show()
                    }
            builder.show()
        }

        btnAlertWithEditText.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("With Edit Text")
            val input = EditText(this)
            val lp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT)
            input.layoutParams = lp
            builder.setView(input)
            builder.setPositiveButton("OK") { dialogInterface, i ->
                Toast.makeText(applicationContext,
                        "Text entered is " + input.text.toString(),
                        Toast.LENGTH_SHORT).show()}
                builder.show()
            }


        }
    }