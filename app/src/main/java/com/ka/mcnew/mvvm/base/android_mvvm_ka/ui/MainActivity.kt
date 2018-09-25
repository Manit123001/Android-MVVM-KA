package com.ka.mcnew.mvvm.base.android_mvvm_ka.ui

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import com.ka.mcnew.mvvm.base.android_mvvm_ka.BR
import com.ka.mcnew.mvvm.base.android_mvvm_ka.R
import com.ka.mcnew.mvvm.base.android_mvvm_ka.ui.base.BaseActivity
import com.ka.mcnew.mvvm.base.android_mvvm_ka.databinding.ActivityMainBinding
import com.ka.mcnew.mvvm.base.android_mvvm_ka.utils.StringUtils
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    @Inject
    lateinit var stringUtils: StringUtils

    override val bindingVariable: Int
        get() = BR.viewModel
    override val layoutId: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel
        get() = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.toast("mViewModel!!.hello() onCreate")
        this.toast("${tv_hello.text} EEEEEEEEEEEEEEEEEEEEEEEEE")

        tv_hello2.text ="Testtttttttttttttttttttt"
        if (savedInstanceState == null) {
            supportFragmentManager.inTransaction {
                add(R.id.contentContainer,
                        MainFragment.newInstance(),
                        "Main Fragment")
            }
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
//        doFragmentTransaction(MainFragment.newInstance(), "Main Fragment", false, "", R.id.contentContainer)
    }


    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)
        this.toast("mViewModel!!.hello() onAttachFragment")
    }

    override fun onContentChanged() {
        super.onContentChanged()
        this.toast("mViewModel!!.hello() onContentChanged")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        this.toast(mViewModel!!.hello())
        this.toast(mViewModel!!.hello2())
        this.toast(stringUtils.init())
    }
}
