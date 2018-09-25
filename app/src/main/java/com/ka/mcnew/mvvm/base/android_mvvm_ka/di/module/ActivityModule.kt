package com.ka.mcnew.mvvm.base.android_mvvm_ka.di.module

import com.ka.mcnew.mvvm.base.android_mvvm_ka.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeMainActivity(): MainActivity

//    @ContributesAndroidInjector(modules = [FragmentModule::class])
//    abstract fun contributeEConsentActivity(): EconsentActivity
}
