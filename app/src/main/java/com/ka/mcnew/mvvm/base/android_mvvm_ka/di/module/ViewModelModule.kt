package com.ka.mcnew.mvvm.base.android_mvvm_ka.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.ka.mcnew.mvvm.base.android_mvvm_ka.di.ViewModelKey
import com.biztech.ibuddy.viewmodel.ProvideViewModelFactory
import com.ka.mcnew.mvvm.base.android_mvvm_ka.ui.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
//    @Binds
//    @IntoMap
//    @ViewModelKey(EconsentViewModel::class)
//    abstract fun bindEconsentViewModel(econsentViewModel: EconsentViewModel): ViewModel
    @Binds
    abstract fun bindViewModelFactory(factory: ProvideViewModelFactory): ViewModelProvider.Factory
}
