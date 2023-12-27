package com.mohamedrayen.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.mohamedrayen.recycleview.models.User

class MyAdapter(val usersList : ArrayList<User>)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var userImage : ImageView
        var userTitle : TextView
        init {
            userImage = itemView.findViewById(R.id.imageView)
            userTitle = itemView.findViewById(R.id.textView)
            itemView.setOnClickListener(){
                Toast.makeText(itemView.context, "${usersList[adapterPosition]}", Toast.LENGTH_SHORT).show()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val x = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_item , parent,false)
        return MyViewHolder(x)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.userImage.setImageResource(usersList[position].image)
        holder.userTitle.setText(usersList[position].name)
    }

    override fun getItemCount(): Int {
       return usersList.size
    }
}