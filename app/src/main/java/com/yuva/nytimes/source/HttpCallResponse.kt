package com.yuva.nytimes.source

interface HttpCallResponse {

    fun OnSuccess(obj: Any)

    fun OnFailure(t: Throwable)

}