package com.rlunaalc.cafeteria

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.rlunaalc.cafeteria.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)


        binding.button.setOnClickListener{
            val usuariTrobat = UsuarisList.usuaris.find {
                it.usuari == binding.username.text.toString() && it.contrasenya == binding.password.text.toString()
            }

            if (usuariTrobat != null){
                Toast.makeText(this, "Usuari trobat!", Toast.LENGTH_SHORT).show()
            }
            else Toast.makeText(this, "Usuari no trobat!", Toast.LENGTH_SHORT).show()

        }

    }
}