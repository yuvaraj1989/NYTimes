package com.yuva.nytimes.viewmodel.homescreen

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yuva.nytimes.model.homescreen.NYTModel
import com.yuva.nytimes.model.homescreen.NYTResponse

class NYTViewModel : ViewModel()
{

    private var mutableLiveData: MutableLiveData<NYTResponse>? = null
    private var nytModel: NYTModel? = null


    init {

    }

    fun init()
    {
        Log.e("NYTimes ","NYTViewModel ");

        if (nytModel == null) {
            nytModel = NYTModel()
        }
        mutableLiveData = NYTModel?.postNytDetails()
    }


    fun getSubmittedTask(): MutableLiveData<NYTResponse>? {
        return mutableLiveData
    }
}