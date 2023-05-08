package com.alpesh1.whatsapp_layout

import Adapter.ChatAdapter
import Model.ProfileModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.alpesh1.whatsapp_layout.R.drawable.jayshree
import com.alpesh1.whatsapp_layout.R.drawable.jyoti
import com.alpesh1.whatsapp_layout.R.drawable.khusbu
import com.alpesh1.whatsapp_layout.R.drawable.kiran
import com.alpesh1.whatsapp_layout.R.drawable.mittal
import com.alpesh1.whatsapp_layout.R.drawable.nilesh
import com.alpesh1.whatsapp_layout.R.drawable.paresh
import com.alpesh1.whatsapp_layout.R.drawable.priya
import com.alpesh1.whatsapp_layout.R.drawable.rahul
import com.alpesh1.whatsapp_layout.R.drawable.rohan
import com.alpesh1.whatsapp_layout.R.drawable.rohit
import com.alpesh1.whatsapp_layout.R.drawable.shital
import com.alpesh1.whatsapp_layout.R.drawable.shruti
import com.alpesh1.whatsapp_layout.R.drawable.swarup
import com.alpesh1.whatsapp_layout.R.drawable.yash
import com.alpesh1.whatsapp_layout.databinding.FragmentChatsBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Fragment_chats : Fragment() {

    var image = arrayOf(
        kiran, rohit, shruti, paresh, jayshree, swarup, yash, rohan, rahul, mittal,
        nilesh, shital, priya, khusbu, jyoti
    )

    var name = arrayOf(
        "Kiran",
        "Rohit",
        "Shruti",
        "Paresh",
        "Jayshree",
        "Swarup",
        "Yash",
        "Rohan",
        "Rahul",
        "Mittal",
        "Nilesh",
        "Shital",
        "Priya",
        "Khusbu",
        "Jyoti"
    )

    lateinit var binding: FragmentChatsBinding
    var dataList = ArrayList<ProfileModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatsBinding.inflate(layoutInflater)

        for (x in 0..image.size-1){
            var data = ProfileModel(image[x],name[x])
            dataList.add(data)
        }

        binding.rcvListChats.layoutManager = LinearLayoutManager(context)
        binding.rcvListChats.adapter = ChatAdapter(dataList)

        return binding.root
    }

}