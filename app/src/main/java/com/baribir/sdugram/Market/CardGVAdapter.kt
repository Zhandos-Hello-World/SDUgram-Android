package com.baribir.sdugram.Market

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.baribir.sdugram.R

class CardGVAdapter(context: Context, resource: Int = 0, objects: MutableList<CardModel>) :
    ArrayAdapter<CardModel>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).
        inflate(R.layout.card_view, parent, false)

        val cardModel = getItem(position)
        val cardText = view.findViewById<TextView>(R.id.text)
        val cardImage = view.findViewById<ImageView>(R.id.image)
        

        cardText.text = cardModel?.name
        cardModel?.imageId?.let { cardImage.setImageResource(it) }
        return view
    }
}