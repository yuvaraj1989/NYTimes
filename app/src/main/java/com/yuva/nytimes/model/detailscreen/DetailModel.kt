package com.yuva.nytimes.model.detailscreen

import android.util.Log
import androidx.lifecycle.MutableLiveData

class DetailModel{

    private var data : MutableLiveData<DetailState>? = null

    init {
        data = MutableLiveData<DetailState>()
    }

    fun ShowDetail(detState: DetailState) : MutableLiveData<DetailState>
    {

        if (detState.title!=null&&detState.adx!=null&&detState.date!=null&&detState.image!=null)
        {
            data?.value = detState as DetailState

        }
        else{
            Log.e("DetailModel ","Some values are getting null")
        }

        return data as MutableLiveData<DetailState>
    }
}

