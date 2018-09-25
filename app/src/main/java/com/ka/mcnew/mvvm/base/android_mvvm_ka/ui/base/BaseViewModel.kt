package com.ka.mcnew.mvvm.base.android_mvvm_ka.ui.base

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean

/**
 * Created by amitshekhar on 07/07/17.
 */
//public abstract class BaseViewModel<N> extends ViewModel {
abstract class BaseViewModel : ViewModel() {
    //    private WeakReference<N> mNavigator;
    val isLoading = ObservableBoolean(false)
    fun setIsLoading(isLoading: Boolean) {
        this.isLoading.set(isLoading)
    }
    //    public N getNavigator() {
    //        return mNavigator.get();
    //    }
    //
    //    public void setNavigator(N navigator) {
    //        this.mNavigator = new WeakReference<>(navigator);
    //    }
}
