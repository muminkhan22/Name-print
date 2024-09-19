package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding:ActivityMainBinding

    val personNames = listOf<String>(
        "Kuddus",
        "kodu",
        "Charlie Brown",
        "David Williams",
        "Emily Davis",
        "Frank Miller",
        "Grace Wilson",
        "Henry Moore",
        "Isabella Taylor",
        "Jack Anderson",
        "Katherine Lee",
        "Liam Martin",
        "Mia Thompson",
        "Noah White",
        "Olivia Harris",
        "Paul Clark",
        "Quinn Lewis",
        "Rachel Walker",
        "Samuel Hall",
        "Tina Allen",
        "Ursula Young",
        "Victor King",
        "Wendy Scott",
        "Xander Green",
        "Yvonne Adams",
        "Zachary Baker",
        "Alice Cooper",
        "Bradley Nelson",
        "Catherine Carter",
        "Daniel Mitchell",
        "Ella Roberts",
        "Felix Turner",
        "Gina Phillips",
        "Henry Evans",
        "Ivy Collins",
        "James Rogers",
        "Karla Stewart",
        "Liam Morris",
        "Maya Murphy",
        "Nathan Reed",
        "Olivia Cook",
        "Peter Bailey",
        "Quinn Price",
        "Riley Perry",
        "Samantha Brooks",
        "Thomas Gray",
        "Uma Barnes",
        "Vera Sanders",
        "William Hughes",
        "Xena Morris",
        "Yara Rivera",
        "Alice Johnson",
        "Bob Smith",
        "Charlie Brown",
        "David Williams",
        "Emily Davis",
        "Frank Miller",
        "Grace Wilson",
        "Henry Moore",
        "Isabella Taylor",
        "Jack Anderson",
        "Katherine Lee",
        "Liam Martin",
        "Mia Thompson",
        "Noah White",
        "Olivia Harris",
        "Paul Clark",
        "Quinn Lewis",
        "Rachel Walker",
        "Samuel Hall",
        "Tina Allen",
        "Ursula Young",
        "Victor King",
        "Wendy Scott",
        "Xander Green",
        "Yvonne Adams",
        "Zachary Baker",
        "Alice Cooper",
        "Bradley Nelson",
        "Catherine Carter",
        "Daniel Mitchell",
        "Ella Roberts",
        "Felix Turner",
        "Gina Phillips",
        "Henry Evans",
        "Ivy Collins",
        "James Rogers",
        "Karla Stewart",
        "Liam Morris",
        "Maya Murphy",
        "Nathan Reed",
        "Olivia Cook",
        "Peter Bailey",
        "Quinn Price",
        "Riley Perry",
        "Samantha Brooks",
        "Thomas Gray",
        "Uma Barnes",
        "Vera Sanders",
        "William Hughes",
        "Xena Morris",
        "Yara Rivera",
        "Zane Collins"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ad = Adapter(personNames.toString())
        ad.submitList(personNames)

        binding.recyclerView.adapter = ad

    }
}