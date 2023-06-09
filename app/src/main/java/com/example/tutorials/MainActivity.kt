package com.example.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.tutorials.databinding.ActivityMainBinding
import com.example.tutorials.network.Character
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by lazy{
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel.characterLiveData.observe(this) { state ->
            processCharactersResponse(state)
        }


    }

    private fun processCharactersResponse(state: ScreenState<List<Character>?>){
        val pb = binding.progressBar


        when(state){
            is ScreenState.Loading -> {
                pb.visibility = View.VISIBLE
            }
            is ScreenState.Success -> {
                pb.visibility = View.GONE
                if(state.data != null){
                    val adapter = MainAdapter(state.data )
                    val recyclerView = binding.charatersRv
                    recyclerView.layoutManager =
                        StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
                    recyclerView.adapter = adapter
                }
            }

            is ScreenState.Error ->{
                pb.visibility = View.GONE
                val view = pb.rootView
                Snackbar.make(view, state.message!!, Snackbar.LENGTH_LONG).show()
            }


        }
    }

}