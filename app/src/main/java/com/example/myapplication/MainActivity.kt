package com.example.myapplication

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.ui.main.SectionsPagerAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import android.view.MenuItem as MenuItem1

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = binding.fab

        tabs.getTabAt(0)?.setIcon(R.drawable.baseline_photo_cam)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    private fun setHasOptionsMenu(b: Boolean) {
        fun onCreateOptionsMenu(menu: Menu): Boolean {
            menuInflater.inflate(R.menu.menu,menu)
            return true
        }
        fun onOptionsItemSelected(item: MenuItem1): Boolean {
            when(item.itemId){
                R.id.plane->
                    Toast.makeText(applicationContext, "airplane mode ", Toast.LENGTH_LONG).show()
                R.id.dark->
                    Toast.makeText(applicationContext, "Enter dark mode", Toast.LENGTH_LONG).show()
                R.id.search->
                    Toast.makeText(applicationContext, "Please search", Toast.LENGTH_LONG).show()
                R.id.settings->
                    Toast.makeText(applicationContext, "Please set me", Toast.LENGTH_LONG).show()

            }

            return true
        }

    }




}

