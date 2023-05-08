package com.alpesh1.whatsapp_layout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import java.text.FieldPosition


class FragPageAdapter2(
    supportFragmentManager: FragmentManager,
    fragments: Array<Fragment>,
    item: Array<String>
) : Fragment() {


    var fragments = fragments
    var item = item

    fun getCount(): Int {
        return fragments.size
    }

    fun getItem(position: Int):Fragment{
        return fragments.get(position)
    }

    fun getPageTitle(position: Int):CharSequence?{
        return item.get(position)
    }
}