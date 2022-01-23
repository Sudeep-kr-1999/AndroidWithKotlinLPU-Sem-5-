package sudeep.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IncreaseAndDecrease : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_increse_and_decrease)
        var resultView= findViewById<TextView>(R.id.result)
        var incrementbutton=findViewById<Button>(R.id.increment)
        var decrementbutton=findViewById<Button>(R.id.decrement)
        incrementbutton.setOnClickListener {
            var result:Int= resultView.text.toString().toInt()+1
            resultView.text= result.toString()
        }
        decrementbutton.setOnClickListener {
            var result:Int= resultView.text.toString().toInt()-1
            resultView.text= result.toString()
        }
    }
}