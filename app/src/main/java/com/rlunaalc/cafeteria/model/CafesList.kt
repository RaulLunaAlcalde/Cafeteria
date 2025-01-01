package com.rlunaalc.cafeteria.model

import com.rlunaalc.cafeteria.R

class CafesList {
    companion object{

        val cafes = listOf(
            ProducteModel("Café Expreso", "Preu: $2.50", R.drawable.coffeebean, 2),
            ProducteModel("Café Americano", "Preu: $3.00", R.drawable.coffeebean, 3),
            ProducteModel("Café Latte", "Preu: $3.50", R.drawable.coffeebean, 4)
        )

    }


}