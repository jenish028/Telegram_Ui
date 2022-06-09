package com.example.telegram_ui.Controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.telegram_ui.Fragment.All_Chart_Fragment
import com.example.telegram_ui.Fragment.Unread_Fragment
import com.example.telegram_ui.MainActivity

class Tab_View_Adpter(mainActivity: MainActivity, supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(supportFragmentManager) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {


        return when (position) {
            0 -> All_Chart_Fragment()
            else ->Unread_Fragment()
        }


    }

}