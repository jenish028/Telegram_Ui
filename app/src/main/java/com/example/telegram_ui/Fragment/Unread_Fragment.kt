package com.example.telegram_ui.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_ui.Controller.Unread_Fargment_adpter
import com.example.telegram_ui.R


class Unread_Fragment : Fragment() {

    lateinit var rv_view2: RecyclerView


    var name =
        arrayOf("chetan", "Vivek", "man", "meet", "Jenish", "mayank", "ronak", "Zenish", "Hiren")
    var ms = arrayOf(
        "image",
        "ok",
        "no chating",
        "oo",
        "hi ",
        "pdf",
        "new",
        "how are you",
        "last seen",
        "ok!!",
        "hi",
        "new ",
        "how can you"
    )
    var time = arrayOf(

        "4:30 PM",
        "5:00 PM",
        "3:30 PM",
        "3:31 PM",
        "YesterDay",
        "YesterDay",
        "YesterDay",
        "YesterDay",
        "YesterDay",

        )
    var img = arrayOf(
        R.drawable.img1,
        R.drawable.img5,
        R.drawable.img5,
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,

        R.drawable.img5,
        R.drawable.img2,

        )

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_unread_, container, false)

        rv_view2 = view.findViewById<RecyclerView>(R.id.rv_view2)

        var adpter = Unread_Fargment_adpter(activity, name, ms, time, img)
        var layoutManager1 = LinearLayoutManager(activity)
        rv_view2.layoutManager = layoutManager1
        rv_view2.adapter = adpter

        return view
    }

}