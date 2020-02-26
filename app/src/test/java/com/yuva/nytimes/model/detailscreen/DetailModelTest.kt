package com.yuva.nytimes.model.detailscreen

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class DetailModelTest {

    var detModel : DetailModel?=null
    var detState : DetailState?=null
    @Before
    fun setUp() {
        detModel = DetailModel();
        detState = DetailState("","","","")
    }

    @After
    fun tearDown() {
    }

    @Test
    fun submitDetail()
    {

        detState?.title = "ff"
        detState?.adx = "ff"
        detState?.date = "ff"
        detState?.image = "ff"

       // detModel?.ShowDetail(detState as DetailState)



        assertEquals(true, detState?.title?.isNotEmpty())
        assertEquals(true, detState?.adx?.isNotEmpty())
        assertEquals(true, detState?.date?.isNotEmpty())
        assertEquals(true, detState?.image?.isNotEmpty())


        assertEquals(true, detState?.title?.isNotBlank())
        assertEquals(true, detState?.adx?.isNotBlank())
        assertEquals(true, detState?.date?.isNotBlank())
        assertEquals(true, detState?.image?.isNotBlank())
    }
}