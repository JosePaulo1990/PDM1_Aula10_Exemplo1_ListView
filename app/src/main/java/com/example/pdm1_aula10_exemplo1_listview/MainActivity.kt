package com.example.pdm1_aula10_exemplo1_listview

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.ComponentActivity
import com.example.pdm1_aula10_exemplo1_listview.databinding.ActivityMainBinding
import com.example.pdm1_aula10_exemplo1_listview.entities.Team

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val teams = arrayOf(
            Team("McLaren", "Reino Unido"),
            Team("Ferrari", "Itália"),
            Team("Red Bull", "Áustria"),
            Team("Mercedes", "Alemanha"),
            Team("Aston Martin", "Reino Unido"),
            Team("Alpine", "França"),
            Team("Haas", "Estados Unidos"),
            Team("Racing Bulls", "Itália"),
            Team("Williams", "Reino Unido"),
            Team("Sauber", "Suíça")
        )

        val teamListView = binding.listView
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, teams)
        teamListView.adapter = adapter

    }
}