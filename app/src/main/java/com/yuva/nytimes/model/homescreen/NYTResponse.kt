package com.yuva.nytimes.model.homescreen

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class NYTResponse
{
    @SerializedName("status")
    @Expose
    private var status: String? = null
    @SerializedName("copyright")
    @Expose
    private var copyright: String? = null
    @SerializedName("num_results")
    @Expose
    private var numResults: Long = 0
    @SerializedName("results")
    @Expose
    private var results: List<Result>? = null

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getCopyright(): String? {
        return copyright
    }

    fun setCopyright(copyright: String) {
        this.copyright = copyright
    }

    fun getNumResults(): Long {
        return numResults
    }

    fun setNumResults(numResults: Long) {
        this.numResults = numResults
    }

    fun getResults(): List<Result>? {
        return results
    }

    fun setResults(results: List<Result>) {
        this.results = results
    }

}