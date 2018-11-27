package com.shalomhalbert.popup.reugiltapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    private var items = listOf<DataService.Boutique>()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerViewHolder  =
            RecyclerViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.list_item, p0, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(p0: RecyclerViewHolder, p1: Int) {
        val item = items[p1]

        p0.name.text = item.name
        p0.description.text = item.description
    }

    fun addItems(list: List<DataService.Boutique>) {
        items = list
        notifyDataSetChanged()
    }

    class RecyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.nameTextView
        val description: TextView = itemView.descriptionTextView
    }
}