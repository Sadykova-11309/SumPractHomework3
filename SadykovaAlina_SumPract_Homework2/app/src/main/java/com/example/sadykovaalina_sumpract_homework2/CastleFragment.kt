package com.example.sadykovaalina_sumpract_homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentCastleBinding
import com.google.android.material.snackbar.Snackbar

class CastleFragment : Fragment(R.layout.fragment_castle) {
    private var binding: FragmentCastleBinding? = null

    private var adapter: CastleAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCastleBinding.bind(view)

        initAdapter()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter(){
        binding?.run{
        adapter = CastleAdapter(
            list = CastleRepository.castles,
            glide = Glide.with(this@CastleFragment),
            onClick = {
                findNavController().navigate(
                    resId = R.id.action_castleFragment_to_castlePageFragment
                )
            }
        )
            rvCastle.adapter = adapter
            rvCastle.layoutManager = LinearLayoutManager(requireContext())
        }

    }
}