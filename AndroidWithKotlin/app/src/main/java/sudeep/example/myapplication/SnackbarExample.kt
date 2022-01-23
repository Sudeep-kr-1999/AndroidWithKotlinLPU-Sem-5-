package sudeep.example.myapplication
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class SnackbarExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar_example)
        val snack=findViewById<Button>(R.id.btnSnack);
        snack.setOnClickListener {
            val snackBar=Snackbar.make(it,"Thanks for visiting",Snackbar.LENGTH_LONG).setAction("Action"){
                Toast.makeText(this,"Snackbar!",Toast.LENGTH_LONG).show();
            }
            snackBar.setTextColor(Color.WHITE);
            snackBar.setActionTextColor(Color.BLACK);
            snackBar.setBackgroundTint(Color.GRAY);
            snackBar.show();
        }

    }
}