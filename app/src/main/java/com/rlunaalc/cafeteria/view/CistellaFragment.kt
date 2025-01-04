package com.rlunaalc.cafeteria.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rlunaalc.cafeteria.CistellaAdapter
import com.rlunaalc.cafeteria.ProducteAdapter
import com.rlunaalc.cafeteria.databinding.FragmentCistellaBinding
import com.rlunaalc.cafeteria.model.CistellaList.Companion.cistellaList
import com.rlunaalc.cafeteria.model.CistellaSharedViewModel
import com.rlunaalc.cafeteria.model.GaletesList.Companion.galetes
import com.rlunaalc.cafeteria.model.ProducteModel

class CistellaFragment : Fragment() {

    private lateinit var binding: FragmentCistellaBinding
    private val sharedViewModel: CistellaSharedViewModel by activityViewModels()


    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCistellaBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.recyclerViewCistella

        // Configuración del RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        sharedViewModel.cistella.observe(viewLifecycleOwner) { llistaProductes ->
            binding.recyclerViewCistella.adapter = CistellaAdapter(llistaProductes) { producte ->
                // Manejar la eliminación de productos desde el adaptador
                sharedViewModel.retirarProducteCistella(producte)
                Toast.makeText(requireContext(), "${producte.nom} eliminat de la cistella", Toast.LENGTH_SHORT).show()
            }

            // Actualizar el texto del total
            val total = sharedViewModel.sumarTotal()
            binding.textTotal.text = "Total: €${"%.2f".format(total)}"
        }

        return binding.root
    }


}