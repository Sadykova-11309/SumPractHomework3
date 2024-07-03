package com.example.sadykovaalina_sumpract_homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentCastleBinding
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentCastlePageBinding
import com.google.android.material.snackbar.Snackbar

class CastlePageFragment : Fragment(R.layout.fragment_castle_page) {
    private var binding: FragmentCastlePageBinding? = null

    private var adapter: CastleAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCastlePageBinding.bind(view)

        binding?.run {
            buttonGoBack.setOnClickListener{
                findNavController().navigate(R.id.action_castlePageFragment_to_castleFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}