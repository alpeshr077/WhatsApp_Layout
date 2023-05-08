package com.alpesh1.whatsapp_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alpesh1.whatsapp_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var item = arrayOf("Chats","Status","Calls")
    var fragments = arrayOf(Fragment_chats(),Fragment_status(),Fragment_calls())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vpFrage.adapter = FragPageAdapter2(supportFragmentManager,fragments, item)
        binding.tabitem.setupWithViewPager(binding.vpFrage)

    }
}