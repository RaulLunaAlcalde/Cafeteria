package com.rlunaalc.cafeteria

class UsuarisList {
    companion object{
        var usuaris = mutableListOf(
            UsuarisModel(usuari = "Raul", contrasenya = "admin", emeal = "raullunaalcalde@gmail.com")
        )
    }

    fun afegirusuaris(usuari: String, password: String, emeal: String){
        usuaris.add(UsuarisModel(usuari = usuari, contrasenya = password, emeal = emeal))
    }
}