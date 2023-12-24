package com.bignerdranch.android.prjregpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "sofa", "Диван", "asdasdasdasdasdqweqweqweqweqwe", "asdasdasdasdasgasdasdasdasdasgdasghdfaghfdahsgfddasghdfaghfdahsgfd", 999))
        items.add(Item(2, "light", "Свет", "asdasdasdasdasdqweqweqweqweqwe", "asdasdasdasdasgasdasdasdasdasgdasghdfaghfdahsgfddasghdfaghfdahsgfd", 399))
        items.add(Item(3, "kitchen", "Кухня", "asdasdasdasdasdqweqweqweqweqwe", "asdasdasdasdasgasdasdasdasdasgdasghdfaghfdahsgfddasghdfaghfdahsgfd", 2999))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}