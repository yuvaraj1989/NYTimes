package com.yuva.nytimes.ui.homescreen

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yuva.nytimes.R
import com.yuva.nytimes.model.homescreen.Result
import com.yuva.nytimes.ui.homescreen.adapter.NYTAdapter
import com.yuva.nytimes.viewmodel.homescreen.NYTViewModel

class NYTActivity : AppCompatActivity()
{

    private var recyclerview: RecyclerView? = null
    private var adapter: NYTAdapter? = null

    private var result: List<Result>? = null
    internal lateinit var nytViewModel: NYTViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    private fun initUI() {
        recyclerview = findViewById(R.id.recyclerview)

        recyclerview!!.layoutManager = LinearLayoutManager(this)

        nytViewModel = ViewModelProvider(this).get(NYTViewModel::class.java)
        nytViewModel.init()

        nytViewModel.getSubmittedTask()?.observe(this, Observer {

            result = it!!.getResults()

            adapter = result?.let { NYTAdapter(this@NYTActivity,it) }
            recyclerview!!.adapter = adapter

            Log.e("NYTimes ","NYTActivity "+it.getResults()?.get(0)?.getAdxKeywords());


        })


    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
    }
}