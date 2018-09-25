package com.ka.mcnew.mvvm.base.android_mvvm_ka.ui

import com.ka.mcnew.mvvm.base.android_mvvm_ka.ui.base.BaseViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor() : BaseViewModel() {
    fun hello(): String {
        return "Hello"
    }

    fun hello2(): String {
        return "Hello2"
    }
}