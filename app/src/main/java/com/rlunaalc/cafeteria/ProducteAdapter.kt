package com.rlunaalc.cafeteria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rlunaalc.cafeteria.model.ProducteModel

class ProducteAdapter(
    private val productes: List<ProducteModel>,
    private val onButtonClick: (ProducteModel) -> Unit // Callback pel clic del botó
) : RecyclerView.Adapter<ProducteAdapter.ProducteViewHolder>()  {

    // ViewHolder per a cada element (imatge, botó, nom i preu)
    class ProducteViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.productImage)
        val nameTextView: TextView = view.findViewById(R.id.productName)
        val priceTextView: TextView = view.findViewById(R.id.productPrice)
        val button: Button = view.findViewById(R.id.productButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProducteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cafe_cardview, parent, false)
        return ProducteViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProducteViewHolder, position: Int) {
        val producte = productes[position]

        // Asignar dades
        holder.imageView.setImageResource(producte.imatge)
        holder.nameTextView.text = producte.nom
        holder.priceTextView.text = producte.preu

        // Configurar el clic del botó
        holder.button.setOnClickListener { onButtonClick(producte) }
    }

    override fun getItemCount(): Int = productes.size
}