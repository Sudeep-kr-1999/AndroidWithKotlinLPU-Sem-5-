package sudeep.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class CheckBoxExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_example)
        var pizza = findViewById<CheckBox>(R.id.checkBox1)
        var coffee = findViewById<CheckBox>(R.id.checkBox2)
        var burger = findViewById<CheckBox>(R.id.checkBox3)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Selected Items")
            if (pizza.isChecked) {
                result.append("\nPizza 100Rs")
                totalAmount += 100
            }
            if (coffee.isChecked) {
                result.append("\nCoffee 50Rs")
                totalAmount += 50
            }
            if (burger.isChecked) {
                result.append("\nBurger 120Rs")
                totalAmount += 120
            }
            result.append("\nTotal: " + totalAmount + "Rs")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
    }