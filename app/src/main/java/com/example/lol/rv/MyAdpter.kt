package com.example.lol.rv

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_android.view.*

class MyAdapter(var list : MutableList<Android>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_android, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.name.text = list[position].name
        holder.version.text = list[position].version
        holder.icon.setImageResource(list[position].icon)
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var name = itemView.txtName
        var version = itemView.txtVersion
        var icon = itemView.imgIcon
        var listView = itemView.viewList
    }
}