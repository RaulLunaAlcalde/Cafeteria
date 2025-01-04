package com.rlunaalc.cafeteria.model

import androidx.lifecycle.MutableLiveData

class CistellaList {
    companion object {
        val cistellaList = MutableLiveData<MutableList<ProducteModel>>(mutableListOf())
    }
}
