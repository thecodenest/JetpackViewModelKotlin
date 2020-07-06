package com.rajendra.jetpackviewmodelkotlin

import androidx.lifecycle.ViewModel

public class GetData : ViewModel() {

    public var totalCount:Int = 0

    fun getCount() : Int{
        totalCount +=1
        return totalCount
    }

}