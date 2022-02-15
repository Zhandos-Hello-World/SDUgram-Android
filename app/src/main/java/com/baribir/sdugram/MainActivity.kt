package com.baribir.sdugram

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.baribir.sdugram.Market.MarketFragment
import com.baribir.sdugram.Market.SearchActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNav_view)
        val navController = findNavController(R.id.navHostFragment)

        bottomNavigationView.setupWithNavController(navController)
    }
}