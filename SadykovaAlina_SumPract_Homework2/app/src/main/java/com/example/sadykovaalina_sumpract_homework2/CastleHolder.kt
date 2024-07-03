package com.example.sadykovaalina_sumpract_homework2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.example.sadykovaalina_sumpract_homework2.databinding.ItemCastleBinding

class CastleHolder(
    private val binding: ItemCastleBinding,
    private val glide: RequestManager,
    private val onClick: () -> Unit,
): ViewHolder(binding.root) {

    fun onBind(castle: Castle){
        binding.run {
            tvCastleName.text = castle.castleName
            tvCastleLocation.text = castle.castleLocation

            glide
                .load(castle.url)
                .error(R.drawable.baseline_castle_24)
                .placeholder(R.drawable.ic_launcher_background)
                .into(ivImage)

            root.setOnClickListener{
                onClick.invoke()
            }
        }
    }
}