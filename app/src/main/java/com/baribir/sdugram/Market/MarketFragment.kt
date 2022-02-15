package com.baribir.sdugram.Market

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.baribir.sdugram.R

class MarketFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_market, container, false)
        val cardTV = view.findViewById<GridView>(R.id.gridView)

        val list = mutableListOf<CardModel>()
        list.add(CardModel("Java", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C++", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Python", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Ruby", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C#", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Java", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C++", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Python", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Ruby", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C#", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Java", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C++", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Python", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Ruby", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C#", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Java", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C++", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Python", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("Ruby", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))
        list.add(CardModel("C#", R.drawable.fruits, "Алматыю, Каскелен", "12 февр."))

        val cardGVAdapter = CardGVAdapter(view.context, objects = list)
        cardTV.adapter = cardGVAdapter
        return view
    }

}