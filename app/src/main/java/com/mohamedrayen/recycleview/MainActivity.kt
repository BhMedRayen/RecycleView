package com.mohamedrayen.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mohamedrayen.recycleview.models.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        var usersList : ArrayList<User> = ArrayList()
        val user1 = User("Ben Hassine Mohamed Rayen",R.drawable.rayen)
        val user2 = User("Ben Hassine Mohamed Rayen",R.drawable.rayen2)
        val user3 = User("Ben Hassine Mohamed Rayen",R.drawable.rayen3)
        val user4 = User("Ben Hassine Mohamed Rayen",R.drawable.rayen4)
        usersList.add(user1)
        usersList.add(user2)
        usersList.add(user3)
        usersList.add(user4)

        val adapter = MyAdapter(usersList)
        recyclerView.adapter = adapter
    }
}