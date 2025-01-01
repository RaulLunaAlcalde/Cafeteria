package com.rlunaalc.cafeteria

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.replace
import com.rlunaalc.cafeteria.databinding.ActivityHomeBinding
import com.rlunaalc.cafeteria.databinding.ActivityLoginBinding
import com.rlunaalc.cafeteria.view.CafesFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        replaceFragment(CafesFragment())

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.galetes -> {
                    replaceFragment(GaletesFragment())
                    true
                }
                R.id.cistella -> {
                    replaceFragment(CistellaFragment())
                    true
                }
                R.id.cafes -> {
                    replaceFragment(CafesFragment())
                    true
                }
                R.id.pastis -> {
                    replaceFragment(PastisFragment())
                    true
                }
                else -> false
            }
        }

    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager: FragmentManager = supportFragmentManager;
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}