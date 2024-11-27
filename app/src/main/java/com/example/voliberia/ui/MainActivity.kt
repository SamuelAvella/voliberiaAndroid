package com.example.voliberia.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import com.example.voliberia.R
import com.example.voliberia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val navHost = supportFragmentManager.findFragmentById(R.id.main_navigation_area) as NavHostFragment //support para poder castear a Fragment
        val navController = navHost.navController

        /*navController.addOnDestinationChangedListener{
                _, _, arguments ->
            binding.bottomNavigation.isVisible =
                arguments?.getBoolean("showBottomNav", true) == true? : true
        }

        binding.bottomNavigation.setupWithNavController(navController)*/
    }
}