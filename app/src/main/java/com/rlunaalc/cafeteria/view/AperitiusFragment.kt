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
import com.rlunaalc.cafeteria.databinding.FragmentAperitiusBinding
import com.rlunaalc.cafeteria.databinding.FragmentCafesBinding
import com.rlunaalc.cafeteria.model.AperitiusList.Companion.aperitius
import com.rlunaalc.cafeteria.model.CafesList.Companion.cafes
import com.rlunaalc.cafeteria.model.CistellaSharedViewModel

class AperitiusFragment : Fragment() {


    private lateinit var binding: FragmentAperitiusBinding
    private val sharedViewModel: CistellaSharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAperitiusBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.recyclerView

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        sharedViewModel.cistella.observe(viewLifecycleOwner){
                llistaAperitius -> binding.recyclerView.adapter = ProducteAdapter(aperitius) {
                aperitiu -> sharedViewModel.afegirACistella(aperitiu)
            Toast.makeText(requireContext(), "${aperitiu.nom} afegit a la cistella", Toast.LENGTH_SHORT).show()
        }
        }

        return binding.root
    }


}