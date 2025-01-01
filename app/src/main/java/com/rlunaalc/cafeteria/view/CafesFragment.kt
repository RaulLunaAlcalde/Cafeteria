package com.rlunaalc.cafeteria.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rlunaalc.cafeteria.ProducteAdapter
import com.rlunaalc.cafeteria.model.ProducteModel
import com.rlunaalc.cafeteria.R
import com.rlunaalc.cafeteria.databinding.FragmentCafesBinding
import com.rlunaalc.cafeteria.model.CafesList.Companion.cafes


class CafesFragment : Fragment() {

    private lateinit var binding: FragmentCafesBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCafesBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.recyclerView

        // Configuración del RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ProducteAdapter(cafes) { cafe ->
            // Acción cuando se hace clic en el botón
            Toast.makeText(requireContext(), "${cafe.nom} añadido al carrito!", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

}