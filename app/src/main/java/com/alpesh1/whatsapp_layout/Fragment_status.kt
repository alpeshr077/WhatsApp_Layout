package com.alpesh1.whatsapp_layout

import Adapter.StatusAdapter
import Model.ProfileModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.alpesh1.whatsapp_layout.R.drawable.*
import com.alpesh1.whatsapp_layout.databinding.FragmentStatusBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Fragment_status : Fragment() {

    var image = arrayOf(
        kiran,
        rohit,
        shruti,
        paresh,
        jayshree,
        swarup,
        yash,
        rohan,
        rahul,
        mittal,
        nilesh,
        shital,
        priya,
        khusbu,
        jyoti
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

    lateinit var binding: FragmentStatusBinding
    var statusList = ArrayList<ProfileModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentStatusBinding.inflate(layoutInflater)

        for (x in 0..image.size-1){
            var data = ProfileModel(image[x],name[x])
            statusList.add(data)
        }

        binding.rcvStatuslist.layoutManager = LinearLayoutManager(context)
        binding.rcvStatuslist.adapter = StatusAdapter(statusList)

        return binding.root
    }

}