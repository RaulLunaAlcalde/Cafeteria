package com.rlunaalc.cafeteria.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rlunaalc.cafeteria.ProducteAdapter
import com.rlunaalc.cafeteria.databinding.FragmentCafesBinding
import com.rlunaalc.cafeteria.databinding.FragmentGaletesBinding
import com.rlunaalc.cafeteria.model.CafesList.Companion.cafes
import com.rlunaalc.cafeteria.model.CistellaSharedViewModel
import com.rlunaalc.cafeteria.model.GaletesList.Companion.galetes

class GaletesFragment : Fragment() {

    private lateinit var binding: FragmentGaletesBinding
    private val sharedViewModel: CistellaSharedViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentGaletesBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.recyclerView

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        sharedViewModel.cistella.observe(viewLifecycleOwner){
                llistaGaletes -> binding.recyclerView.adapter = ProducteAdapter(galetes) {
                galeta -> sharedViewModel.afegirACistella(galeta)
            Toast.makeText(requireContext(), "${galeta.nom} afegit a la cistella", Toast.LENGTH_SHORT).show()
        }
        }

        return binding.root
    }


}