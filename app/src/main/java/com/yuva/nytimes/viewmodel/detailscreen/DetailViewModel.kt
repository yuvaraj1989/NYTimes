package com.yuva.nytimes.viewmodel.detailscreen

import android.content.Intent
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yuva.nytimes.model.detailscreen.DetailModel
import com.yuva.nytimes.model.detailscreen.DetailState

class DetailViewModel : ViewModel()
{
    private var mutableLiveData: MutableLiveData<DetailState>? = null
    private var detModel: DetailModel? = null
    private var detState: DetailState? = null


    init {

    }

    fun init(intent: Intent?)
    {
        Log.e("NYTimes ","NYTViewModel ");

        if (detModel == null) {

            detState = DetailState(
                intent?.extras?.get("TIT").toString(),
                intent?.extras?.get("ADX").toString(),
                intent?.extras?.get("DT").toString(),
                intent?.extras?.get("IMG").toString()
            )
            detModel = DetailModel()
        }
        mutableLiveData = detModel?.ShowDetail(detState as DetailState)
    }


    fun getDetailLiveData(): MutableLiveData<DetailState>? {
        return mutableLiveData
    }
}