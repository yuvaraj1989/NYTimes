package com.yuva.nytimes.ui

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.yuva.nytimes.R

class ErrorDialog(
    var c: Activity,
    private val mTitle: String,
    private val mMessage: String
)// TODO Auto-generated constructor stub
    : Dialog(c), View.OnClickListener {
    var d: Dialog? = null
    private var labeltitle: TextView? = null
    private var labelmessage: TextView? = null
    private var mYes: Button? = null

    override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.error_dialog)
        this.initViews()
        labeltitle!!.text = mTitle
        labelmessage!!.text = mMessage


    }

    private fun initViews() {
        labeltitle = findViewById(R.id.labletitle) as TextView
        labelmessage = findViewById(R.id.message) as TextView
        mYes = findViewById(R.id.buttonok) as Button
        mYes!!.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonok -> dismiss()


            else -> {
            }
        }
        //dismiss();
    }
}
