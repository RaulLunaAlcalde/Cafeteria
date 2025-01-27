package com.rlunaalc.cafeteria.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CistellaSharedViewModel : ViewModel() {

    private val _cistella = MutableLiveData<MutableList<ProducteModel>>(mutableListOf())
    val cistella: LiveData<MutableList<ProducteModel>> get() = _cistella

    fun afegirACistella(producte: ProducteModel) {
        val carretActual = _cistella.value ?: mutableListOf()
        carretActual.add(producte)
        _cistella.value = carretActual
    }

    fun retirarProducteCistella(producte: ProducteModel) {
        val carretActual = _cistella.value ?: mutableListOf()
        carretActual.remove(producte)
        _cistella.value = carretActual
    }

    fun sumarTotal(): Double {
        return _cistella.value?.sumOf { it.preuFinal } ?: 0.0
    }

    fun totalProductes(): Int? {
        return _cistella.value?.size
    }
}
