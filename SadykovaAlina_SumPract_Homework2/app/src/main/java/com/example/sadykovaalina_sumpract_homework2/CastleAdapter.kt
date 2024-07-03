package com.example.sadykovaalina_sumpract_homework2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.sadykovaalina_sumpract_homework2.databinding.ItemCastleBinding

class CastleAdapter(
    private val list: List<Castle>,
    private val glide: RequestManager,
    private val onClick: () -> Unit,
) : RecyclerView.Adapter<CastleHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CastleHolder = CastleHolder (
        binding = ItemCastleBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onClick = onClick
    )

    override fun onBindViewHolder(holder: CastleHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}