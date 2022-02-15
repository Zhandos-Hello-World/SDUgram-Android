package com.baribir.sdugram.Market

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.baribir.sdugram.MainActivity
import com.baribir.sdugram.R

class SearchActivity : AppCompatActivity() {
    lateinit var searchEditText:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        searchEditText = findViewById(R.id.search_text)
        searchEditText.isFocusableInTouchMode = true
        searchEditText.requestFocus()
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        super.onBackPressed()
    }
}