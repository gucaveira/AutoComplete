package com.dominando.android.autocomplete

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.dominando.android.autocomplete.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val cities = listOf(
            "Caruaru",
            "Cabo de Santo Agostinho",
            "Recife",
            "São Paulo",
            "Santos",
            "Santa Cruz"
        )

        val adapter = CitySearchAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            cities
        )


        binding.actCities.setAdapter(adapter)

    }
}