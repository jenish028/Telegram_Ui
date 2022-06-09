package com.example.telegram_ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.telegram_ui.Controller.Tab_View_Adpter
import com.example.telegram_ui.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity()
//    , NavigationView.OnNavigationItemSelectedListener
{

    lateinit var blinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
        blinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(blinding.root)
        blinding.menuBtn.setOnClickListener {
            blinding.drawerLayout1.openDrawer(GravityCompat.START)
//            blinding.NavigationId.setNavigationItemSelectedListener(this)

        }

        Tab_view_setting()
blinding.pencilCv.setOnClickListener {

    Toast.makeText(this,"HI Succesful",Toast.LENGTH_SHORT).show()
}

    }

    fun Tab_view_setting() {

        blinding.tabView.addTab(blinding.tabView.newTab().setText("All Chart"))
        blinding.tabView.addTab(blinding.tabView.newTab().setText("Unread"))


        var adpter1 = Tab_View_Adpter(this, supportFragmentManager)
        blinding.pagerView.adapter = adpter1

        blinding.pagerView.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(blinding.tabView))
        blinding.tabView.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {

                blinding.pagerView.currentItem=tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }


        })

    }

}