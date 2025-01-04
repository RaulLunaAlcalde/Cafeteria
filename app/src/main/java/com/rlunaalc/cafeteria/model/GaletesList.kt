package com.rlunaalc.cafeteria.model

import com.rlunaalc.cafeteria.R

class GaletesList {
    companion object{

        val galetes = listOf(
            ProducteModel("Galeta de Xocolata", "Preu: 1,50 €", R.drawable.cookie, 1.50),
            ProducteModel("Galeta de Civada", "Preu: 1,75 €", R.drawable.cookie, 1.75),
            ProducteModel("Galeta de Mantega", "Preu: 2,00 €", R.drawable.cookie, 2.0),
            ProducteModel("Galeta de Gingebre", "Preu: 2,25 €", R.drawable.cookie, 2.25),
            ProducteModel("Galeta amb Gotes de Xocolata", "Preu: 2,50 €", R.drawable.cookie, 2.5),
            ProducteModel("Galeta d'Ametlla", "Preu: 2,75 €", R.drawable.cookie, 2.75),
            ProducteModel("Galeta Farcida de Crema", "Preu: 3,00 €", R.drawable.cookie, 3.0)
        )


    }
}