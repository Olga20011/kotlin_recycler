package com.example.assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumbersRvAdapter(var numbersList:List<BigInteger>):RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var numsView=LayoutInflater.from(parent.context).inflate(R.layout.number_list,parent,false)
        return NumberViewHolder(numsView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvnums.text=numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return  numbersList.size
    }


}
class NumberViewHolder(numsView:View):RecyclerView.ViewHolder(numsView) {
    var tvnums = numsView.findViewById<TextView>(R.id.tvnums)
}