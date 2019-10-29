package com.hawk.kotlinexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private val listClub: ArrayList<ItemClub> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addClub()
        initView()
    }

    private fun addClub() {
        listClub.add(ItemClub("Bernd Leno", "Germany", "0"))
        listClub.add(ItemClub("Eden Hazard", "Belgium", "1"))
        listClub.add(ItemClub("David Luiz", "Brazil", "1"))
        listClub.add(ItemClub("Shkodran Mustafi", "Germany", "0"))
        listClub.add(ItemClub("Mesut Ozil", "Germany", "0"))
        listClub.add(ItemClub("Alexandre Lacazette", "France", "0"))
        listClub.add(ItemClub("Olivier Giroud", "France", "1"))
        listClub.add(ItemClub("Jorginho", "Brazil", "1"))
        listClub.add(ItemClub("Laurent Koscielny", "Germany", "0"))
        listClub.add(ItemClub("Gary Cahill", "England", "1"))
        listClub.add(ItemClub("Matteo Guendouzi", "Germany", "0"))
        listClub.add(ItemClub("Ngolo Kante", "France", "1"))
        listClub.add(ItemClub("Pierre-Emerick Aubameyang", "Gabon", "0"))
        listClub.add(ItemClub("Danny Welbeck", "England", "0"))
        listClub.add(ItemClub("Rob Holding", "England", "0"))
        listClub.add(ItemClub("Ross Barkley", "England", "1"))
        listClub.add(ItemClub("Willian", "Brazil", "1"))
    }

    private fun initView() {
        val clubAdapter = ClubAdapter(listClub,this)
        val premierLeague = findViewById<RecyclerView>(R.id.premier_league_recycler_view)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        premierLeague.layoutManager = layoutManager
        premierLeague.adapter = clubAdapter
    }
}
