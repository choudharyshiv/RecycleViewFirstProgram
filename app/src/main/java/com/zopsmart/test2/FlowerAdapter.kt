import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.zopsmart.test2.R
import com.zopsmart.test2.SpecificFlowerActivity

class FlowerAdapter(private var context : Context , private val flowersList : ArrayList<FlowerData>) : RecyclerView.Adapter<FlowerAdapter.MyHolder>() {



      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
            var view = LayoutInflater.from(context).inflate(R.layout.item_design,parent ,false)
            return MyHolder(view)

      }

      override fun onBindViewHolder(holder: MyHolder, position: Int) {

             var flowerItemData = flowersList[position]
             holder.flowerNameTextView.text = flowerItemData.flowerName


            //when click on the item,  open a specific flower activity
            holder.itemView.setOnClickListener(){
                  val intent : Intent= Intent(context, SpecificFlowerActivity::class.java)
                  intent.putExtra("flowerName",flowerItemData.flowerName)
                  startActivity(context,intent,null)
            }

      }

      override fun getItemCount(): Int {
           return flowersList.size
      }



      class MyHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
      {
            val flowerImageView =  itemView.findViewById<ImageView>(R.id.flowerPicImageView)
            val flowerNameTextView = itemView.findViewById<TextView>(R.id.flowerNameTextView)

      }

}