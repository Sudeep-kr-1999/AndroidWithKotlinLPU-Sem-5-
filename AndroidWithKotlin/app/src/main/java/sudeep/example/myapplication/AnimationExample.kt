package sudeep.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class AnimationExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_example)
        val fadein=findViewById<Button>(R.id.fade_in);
        val fadeout=findViewById<Button>(R.id.fade_out);
        val zoomin=findViewById<Button>(R.id.zoom_in);
        val zoomout=findViewById<Button>(R.id.zoom_out);
        val slidedown=findViewById<Button>(R.id.slide_down);
        val slideup=findViewById<Button>(R.id.slide_up);
        val bounce=findViewById<Button>(R.id.bounce_btn);
        val rotate=findViewById<Button>(R.id.rotate);
        val textView=findViewById<TextView>(R.id.animation_example)

        fadein.setOnClickListener {
            textView.visibility= View.VISIBLE
            val animationFadeIn=AnimationUtils.loadAnimation(this,R.anim.fade_in);
            textView.startAnimation(animationFadeIn)
        }
        fadeout.setOnClickListener {
            textView.visibility= View.VISIBLE
            val animationFadeout=AnimationUtils.loadAnimation(this,R.anim.fade_out);
            textView.startAnimation(animationFadeout)
        }
        slidedown.setOnClickListener {
            textView.visibility= View.VISIBLE
            val animationFadeslidedown=AnimationUtils.loadAnimation(this,R.anim.slide_down);
            textView.startAnimation(animationFadeslidedown)
        }
        slideup.setOnClickListener {
            textView.visibility= View.VISIBLE
            val slideup=AnimationUtils.loadAnimation(this,R.anim.slide_up);
            textView.startAnimation(slideup)
        }
        zoomin.setOnClickListener {
            textView.visibility= View.VISIBLE
            val zoomin=AnimationUtils.loadAnimation(this,R.anim.zoom_in);
            textView.startAnimation(zoomin);
        }
        zoomout.setOnClickListener {
            textView.visibility= View.VISIBLE
            val zoomout=AnimationUtils.loadAnimation(this,R.anim.zoom_out);
            textView.startAnimation(zoomout)
        }

        bounce.setOnClickListener {
            textView.visibility= View.VISIBLE
            val bounce=AnimationUtils.loadAnimation(this,R.anim.bounce);
            textView.startAnimation(bounce)
        }
        rotate.setOnClickListener {
            textView.visibility= View.VISIBLE
            val rotate=AnimationUtils.loadAnimation(this,R.anim.rotate);
            textView.startAnimation(rotate)
        }
    }
}