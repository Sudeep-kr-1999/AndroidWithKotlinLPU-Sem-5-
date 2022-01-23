package sudeep.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EditTextExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_example)
        var name = findViewById<EditText>(R.id.txtName)
        var password = findViewById<EditText>(R.id.txtPwd)
        var email = findViewById<EditText>(R.id.txtEmai)
        var dob = findViewById<EditText>(R.id.txtDate)
        var phoneno = findViewById<EditText>(R.id.txtPhone)
        var btnSubmit = findViewById<Button>(R.id.btnSend)
        var result = findViewById<TextView>(R.id.resultView)
        btnSubmit.setOnClickListener {
            if (name.text.toString()==""||password.text.toString()==""|| email.text.toString()==""|| phoneno.text.toString()==""||
                    dob.text.toString()==""){
                result.text="Please Fill all the details"
            }
            else{
                result.text="""Name-${name.text}
                                Password-${password.text}
                                Email- ${email.text}
                                DOB - ${dob.text}
                                Contact - ${phoneno.text} """
            }
        }

    }

}