package sudeep.example.myapplication
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView

open class ImageAdapter(private val mContext: Context) : BaseAdapter()
{

    override fun getCount(): Int { return thumbImages.size  }

    override fun getItem(position: Int): Any? {  return null }

    override fun getItemId(position: Int): Long { return 0   }

    // create a new ImageView for each item referenced by the Adapter

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView = ImageView(mContext)
        imageView.layoutParams = AbsListView.LayoutParams(200, 200)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.setPadding(8, 8, 8, 8)
        imageView.setImageResource(thumbImages[position])
        return imageView
    }
    var thumbImages = arrayOf(
            R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.moneyheist,R.drawable.monkey,
        R.drawable.pic3,R.drawable.pic4
    )

}