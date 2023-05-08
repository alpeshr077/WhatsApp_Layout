package Adapter

import Model.ProfileModel
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StatusAdapter(statusList: ArrayList<ProfileModel>) : RecyclerView.Adapter<StatusAdapter.StatusHolder>() {

    class StatusHolder(itemView : View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        TODO("Not yet implemented")
    }
}