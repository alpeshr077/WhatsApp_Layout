package Adapter

import Model.ProfileModel
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CallsAdapter(callList: ArrayList<ProfileModel>) : RecyclerView.Adapter<CallsAdapter.CallsHolder>() {

    class CallsHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CallsHolder, position: Int) {
        TODO("Not yet implemented")
    }
}