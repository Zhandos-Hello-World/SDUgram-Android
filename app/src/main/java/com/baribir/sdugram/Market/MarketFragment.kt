package com.baribir.sdugram.Market

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.GridView
import com.baribir.sdugram.R

class MarketFragment : Fragment() {

    lateinit var searchText: EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_market, container, false)
        val cardTV = view.findViewById<GridView>(R.id.gridView)
        searchText = view.findViewById(R.id.search_text)
        searchText.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus) {
                val intent = Intent(activity, SearchActivity::class.java)
                startActivity(intent)
            }
        }

        val list = mutableListOf<CardModel>()
        list.add(CardModel("Java", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C++", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Python", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Ruby", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C#", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Hello", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Hi", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("How", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("are", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("you", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))



        val cardGVAdapter = CardGVAdapter(view.context, objects = list)
        cardTV.adapter = cardGVAdapter
        return view
    }

}