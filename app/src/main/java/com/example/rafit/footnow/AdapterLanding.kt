package com.example.rafit.footnow

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_card_evento.view.*

class AdapterLanding(val data:List<ItemLanding>):RecyclerView.Adapter<AdapterLanding.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder = Holder(parent?.inflate(R.layout.item_card_evento))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindView(data[position])

    }

    class Holder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindView(itemLanding: ItemLanding){
            with(itemLanding){
                itemView.txtNomEvent.text = nombreEvento
                itemView.hora.text = hora
                itemView.ubi.text = ubicacion
                itemView.plazas.text = plaza


            }

        }
    }
}