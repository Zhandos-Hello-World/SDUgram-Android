package com.baribir.sdugram.Market

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.baribir.sdugram.R

class CardGVAdapter(context: Context, resource: Int = 0, objects: MutableList<CardModel>) :
    ArrayAdapter<CardModel>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val listView = convertView ?: LayoutInflater.from(context).
        inflate(R.layout.card_view, parent, false)

        val courseModel = getItem(position)
        val cardText = listView.findViewById<TextView>(R.id.text)
        val cardImage = listView.findViewById<ImageView>(R.id.image)
        cardText.setText(courseModel?.name)
        courseModel?.imageId?.let { cardImage.setImageResource(it) }

        return listView
    }
}