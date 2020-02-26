package com.yuva.nytimes.source

import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import java.util.concurrent.TimeUnit

object RetrofitService {

    val BASE_URL = "https://api.nytimes.com"

    internal var interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    internal var tokenInterceptor = TokenInterceptor()
    internal var client = OkHttpClient.Builder()
        .connectTimeout(5, TimeUnit.MINUTES)
        .readTimeout(5, TimeUnit.MINUTES)
        .addInterceptor(tokenInterceptor).addInterceptor(interceptor).build()
    internal var gson = GsonBuilder()
        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
        .create()


    internal var retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    class TokenInterceptor() : Interceptor {

        @Throws(IOException::class)
        override fun intercept(chain: Interceptor.Chain): Response {


            var initialRequest = chain.request()

            val sToken = ""
            if (sToken != null) {
                initialRequest = initialRequest.newBuilder()
                    .addHeader("Content-Type", "application/json")
                    .header("appname", "BounceCampus")
                   // .header("Authorization", "Bearer" + " " + LoginActivity.token)
                    .build()
            }

            return chain.proceed(initialRequest)
        }
    }


}
