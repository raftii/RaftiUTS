package com.dev.raftiuts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_list)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewChat)

        val chatList = listOf(
            Chat("Andi", "Halo, apa kabar?", "12:00", R.mipmap.ic_launcher_round),
            Chat("Budi", "Jangan lupa tugasnya ya", "11:45", R.mipmap.ic_launcher_round),
            Chat("Citra", "Oke, terima kasih!", "10:20", R.mipmap.ic_launcher_round),
            Chat("Dina", "Sampai jumpa besok", "08:30", R.mipmap.ic_launcher_round)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ChatAdapter(chatList)
    }
}

