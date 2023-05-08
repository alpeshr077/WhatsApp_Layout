package com.alpesh1.whatsapp_layout

import Adapter.CallsAdapter
import Model.ProfileModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.alpesh1.whatsapp_layout.R.drawable.*
import com.alpesh1.whatsapp_layout.databinding.FragmentCallsBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Fragment_calls : Fragment() {

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

    lateinit var binding: FragmentCallsBinding
    var callList = ArrayList<ProfileModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCallsBinding.inflate(layoutInflater)

        for (x in 0..image.size-1){
            var data = ProfileModel(image[x],name[x])
            callList.add(data)
        }

        binding.rcvListCall.layoutManager = LinearLayoutManager(context)
        binding.rcvListCall.adapter = CallsAdapter(callList)

        return binding.root
    }


}