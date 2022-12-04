package com.example.timeline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.PopupMenu
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.timeline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController=findNavController(R.id.mainFragment)
        //setupActionBarWithNavController(navController)
        setupBottomNavigationMenu()


    }

    private fun setupBottomNavigationMenu() {
        val popupMenu = PopupMenu(this,null)
        popupMenu.inflate((R.menu.bottom_nav))
        val menu = popupMenu.menu
        binding.bottomNavigationView.setupWithNavController(navController)
    }

    fun onSupportNavigation(): Boolean{
        return navController.navigateUp() || super.onSupportNavigateUp()
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_file,menu)
        return super.onCreateOptionsMenu(menu)
    }



}