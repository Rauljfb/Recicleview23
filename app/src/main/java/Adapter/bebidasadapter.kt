package Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nuevorecycleview.R
import com.example.nuevorecycleview.bebidasA

class bebidasadapter (private val bebidasB: List<bebidasA>): RecyclerView.Adapter<bebidasviewholder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bebidasviewholder {
    val layoutInflater = LayoutInflater.from(parent.context)
        return bebidasviewholder(layoutInflater.inflate(R.layout.layoutbebidas, parent, false))
    }

    override fun getItemCount(): Int {
        return bebidasB.size
    }

    override fun onBindViewHolder(holder: bebidasviewholder, position: Int) {
    }
}