package com.baribir.sdugram.Market

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.baribir.sdugram.MainActivity
import com.baribir.sdugram.R

class SearchActivity : AppCompatActivity() {
    lateinit var searchEditText:EditText
    lateinit var listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        searchEditText = findViewById(R.id.search_text)
        listView = findViewById(R.id.found_list)

        var list = mutableListOf<String>()
        for (i in 0..10) {
            list.add("MacBook Air")
        }

        listView.adapter = ArrayAdapter(this, R.layout.list_view, R.id.title_text,
        list)



        searchEditText.isFocusableInTouchMode = true
        searchEditText.requestFocus()

    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        super.onBackPressed()
    }
}