package com.hawk.kotlinexample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_arsenal.view.*


class ClubAdapter(private val listClub: List<ItemClub>, private val context: Context) : RecyclerView.Adapter<ClubAdapter.RecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_arsenal, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listClub.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.fullName.text = listClub[position].fullName
        holder.country.text = listClub[position].country
    }

    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val fullName = itemView.full_name_text_view
        val country = itemView.country_text_view
    }
}