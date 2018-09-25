package com.ka.mcnew.mvvm.base.android_mvvm_ka.ui

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.ka.mcnew.mvvm.base.android_mvvm_ka.BR
import com.ka.mcnew.mvvm.base.android_mvvm_ka.R
import com.ka.mcnew.mvvm.base.android_mvvm_ka.ui.base.BaseFragment
import com.ka.mcnew.mvvm.base.android_mvvm_ka.databinding.FragmentMainBinding
import com.ka.mcnew.mvvm.base.android_mvvm_ka.di.Injectable

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(), Injectable {
    override val bindingVariable: Int
        get() = BR.viewModel
    override val layoutId: Int
        get() = R.layout.fragment_main
    override val viewModel: MainViewModel
        get() = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)


    companion object {
        fun newInstance(): MainFragment {
            val args = Bundle()
            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }
    }
}