package com.yuva.nytimes.ui.detailscreen

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.squareup.picasso.Picasso
import com.yuva.nytimes.R
import com.yuva.nytimes.viewmodel.detailscreen.DetailViewModel

class NYTDetailPage : AppCompatActivity(){

    private var nytdetail_img : ImageView? = null
    private var txttitle : TextView? =null
    private var txtAdx : TextView? =null
    private var pubDate : TextView? =null
    internal lateinit var detViewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nyt_detail_page)

        initUI()

    }

    private fun initUI() {
        nytdetail_img = findViewById(R.id.nytdetail_img)
        txttitle = findViewById(R.id.txttitle)
        txtAdx = findViewById(R.id.txtAdx)
        pubDate = findViewById(R.id.pubDate)



        detViewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        detViewModel.init(getIntent())

        detViewModel.getDetailLiveData()?.observe(this, Observer {

            txttitle?.text = it.title
            txtAdx?.text = it.adx
            pubDate?.text = it.date
            val picasso = Picasso.get()
            picasso.load(it.image)
                .into(nytdetail_img)


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