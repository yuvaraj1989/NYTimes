package com.yuva.nytimes.model.homescreen

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.yuva.nytimes.source.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Headers
import retrofit2.http.POST


private var newData: MutableLiveData<NYTResponse>? = null

class NYTModel{
    interface NYTInterFace {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("/svc/mostpopular/v2/viewed/7.json?api-key=QnrHOE8QdFAljTfxkZJoAQIwsodE5ELG")
        fun campstatus(): Call<NYTResponse>
    }

    companion object {


        fun postNytDetails() : MutableLiveData<NYTResponse>{
            Log.e("NYTimes ","NYTModel ");

            newData = MutableLiveData<NYTResponse>()
            val mInterFace = RetrofitService.retrofit.create(NYTInterFace::class.java)
            val mCall = mInterFace.campstatus()
            mCall.enqueue(object : Callback<NYTResponse> {
                override fun onResponse(
                    call: Call<NYTResponse>,
                    response: Response<NYTResponse>
                ) {
                    Log.e("NYTimes ","OnSuccess "+response.body());

                    if (response.isSuccessful) {
                        newData?.value = response.body() as NYTResponse
                    }
                }

                override fun onFailure(call: Call<NYTResponse>, t: Throwable) {
                    Log.e("NYTimes ","onFailure "+t.toString());

                    //newData?.value = t as NYTResponse
                }
            })
            return newData as MutableLiveData<NYTResponse>

        }
    }

}

