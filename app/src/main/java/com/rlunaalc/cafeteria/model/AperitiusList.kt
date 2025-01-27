package com.rlunaalc.cafeteria.model

import com.rlunaalc.cafeteria.R

class AperitiusList {
    companion object{

        val aperitius = listOf(
            ProducteModel("patatas bravas", "Preu: $2.50", R.drawable.patatasbravas, 2.50),
            ProducteModel("patatas bravas picantes", "Preu: $3.00", R.drawable.patatasbravas, 3.0),
            ProducteModel("patatas no bravas", "Preu: $1.50", R.drawable.patatasbravas, 3.5)
        )

    }
}