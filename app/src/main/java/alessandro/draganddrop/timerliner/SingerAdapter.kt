package alessandro.draganddrop.timerliner


import alessandro.draganddrop.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by paetztm on 2/6/2017.
 */
class SingerAdapter(
    private val layoutInflater: LayoutInflater,
    private val singerList: List<Singer>,
    @param:LayoutRes private val rowLayout: Int
) : RecyclerView.Adapter<SingerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = layoutInflater.inflate(
            rowLayout,
            parent,
            false
        )
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val singer = singerList[position]
        holder.fullName.text = singer.name
    }

    override fun getItemCount(): Int = singerList.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fullName: AppCompatTextView = view.findViewById<View>(R.id.full_name_tv) as AppCompatTextView

    }
}
