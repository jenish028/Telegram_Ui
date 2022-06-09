package com.example.telegram_ui.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_ui.R

class Unread_Fargment_adpter(
    val activity: FragmentActivity?,
    val name: Array<String>,
    val ms: Array<String>,
    val time: Array<String>,
    val img: Array<Int>
) : RecyclerView.Adapter<Unread_Fargment_adpter.ViewData>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {
        var view = LayoutInflater.from(activity).inflate(R.layout.rv_item, parent, false)
        return ViewData(view)


    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.txt_rv_item1_name.text = name[position]
        holder.txt_rv_item1_message.text = ms[position]
        holder.txt_rv_item_time.text = time[position]
        holder.img_rv_item.setImageResource(img[position])


    }


    override fun getItemCount(): Int {

        return name.size
    }


    class ViewData(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val img_rv_item = itemView.findViewById<ImageView>(R.id.img_rv_item)
        val txt_rv_item1_name = itemView.findViewById<TextView>(R.id.txt_rv_item1_name)
        val txt_rv_item1_message = itemView.findViewById<TextView>(R.id.txt_rv_item1_message)
        val txt_rv_item_time = itemView.findViewById<TextView>(R.id.txt_rv_item_time)


    }

}