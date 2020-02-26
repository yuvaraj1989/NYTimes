package com.yuva.nytimes.model.homescreen

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class MediaMetadatum {
    @SerializedName("url")
    @Expose
    private var url: String? = null
    @SerializedName("format")
    @Expose
    private var format: String? = null
    @SerializedName("height")
    @Expose
    private var height: Long = 0
    @SerializedName("width")
    @Expose
    private var width: Long = 0

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getFormat(): String? {
        return format
    }

    fun setFormat(format: String) {
        this.format = format
    }

    fun getHeight(): Long {
        return height
    }

    fun setHeight(height: Long) {
        this.height = height
    }

    fun getWidth(): Long {
        return width
    }

    fun setWidth(width: Long) {
        this.width = width
    }

}