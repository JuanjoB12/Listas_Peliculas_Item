package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listas.adapter.FilmAdapter
import com.example.listas.databinding.ActivityEditFilmBinding

class EditFilmActivity : ActivityWithMenus() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEditFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val decoration = DividerItemDecoration(this, VERTICAL)
        val manager = LinearLayoutManager(this)
        binding.recycler.layoutManager = manager
        binding.recycler.adapter=FilmAdapter(FilmProvider.filmList)
        //binding.recycler.addItemDecoration(decoration)



    }


}
