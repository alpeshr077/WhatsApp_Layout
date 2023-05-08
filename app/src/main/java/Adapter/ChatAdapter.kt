package Adapter

import Model.ProfileModel
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import de.hdodenhof.circleimageview.R

class ChatAdapter(dataList: ArrayList<ProfileModel>) : RecyclerView.Adapter<ChatAdapter.ChatsHolder>() {

    var dataList = dataList

    class ChatsHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image = itemView.findViewById<CircleImageView>(com.alpesh1.whatsapp_layout.R.id.profile)
        var name = itemView.findViewById<TextView>(com.alpesh1.whatsapp_layout.R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsHolder {

        var view = LayoutInflater.from(parent.context).inflate(com.alpesh1.whatsapp_layout.R.layout.chat_item,parent,false)
        return ChatsHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ChatsHolder, position: Int) {
        holder.image.setImageResource(dataList.get(position).image)
        holder.name.text = dataList.get(position).name
    }
}