package sudeep.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast

class ListViewExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_example)
        val lv=findViewById<ListView>(R.id.lv1)
        val ll=findViewById<LinearLayout>(R.id.ll)
//        var b= arrayOf("Apple","Banana","Carrot","Grapes")
//        var ab=ArrayAdapter(this,android.R.layout.simple_list_item_1,b)
//        lv.adapter=ab
//        lv.setOnItemClickListener { adapterView, view, position, id ->
//            val str=adapterView.getItemAtPosition(position) as String
//            Toast.makeText(this,"your selected $str",Toast.LENGTH_LONG).show()
//        }


//        this is to change the background color of app from the item selected in the list view
        val a = arrayOf(Color.RED,Color.BLUE,Color.YELLOW,Color.WHITE)
        val b= arrayOf("RED","BLUE","YELLOW","WHITE")
        val ab=ArrayAdapter(this,android.R.layout.simple_list_item_1,b)
        lv.adapter = ab
        lv.setOnItemClickListener { parent, view, position, id ->
            ll.setBackgroundColor(a[position])
        }
    }
}