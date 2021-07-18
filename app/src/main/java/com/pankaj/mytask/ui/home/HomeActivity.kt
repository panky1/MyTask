package com.pankaj.mytask.ui.home

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.pankaj.mytask.R
import com.pankaj.mytask.data.remote.api.config.Resource
import com.pankaj.mytask.databinding.ActivityHomeBinding
import com.pankaj.mytask.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_home.*
import com.pankaj.mytask.data.remote.api.config.*

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    private val homeViewModel : HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setObservers()
    }

    private fun setObservers() {
        homeViewModel.teamListLiveData.observe(this, Observer {
            when(it.status){
                Resource.Status.LOADING -> {
                    initLoader()
                }
                Resource.Status.SUCCESS -> {
                    finishLoader()
                    viewPager.adapter = PagerAdapter(supportFragmentManager,it.data?.teamsData)
                    tabLayout.setupWithViewPager(viewPager)

                }
                Resource.Status.ERROR -> {
                    finishLoader()
                    it.error?.let { error ->
                        when (error.errorType) {
                            Error.ErrorType.NO_INTERNET_ERROR -> {
                                showToast(getString(R.string.no_internet_connection),Toast.LENGTH_SHORT)
                            }
                            Error.ErrorType.GENERAL_ERROR -> {
                                showToast(getString(R.string.something_went_wrong),Toast.LENGTH_SHORT)
                            }
                            Error.ErrorType.NETWORK_ERROR -> {
                                showToast(getString(R.string.network_error),Toast.LENGTH_SHORT)
                            }
                            else -> error.errorMessage?.let { it1 -> showToast(it1) }
                        }
                    }
                }
            }
        })
    }

    private fun setUp() {

    }


    override val layoutResourceId: Int
        get() = R.layout.activity_home
    override val currentFragment: Fragment?
        get() = null
    override val fragmentContainerId: Int
        get() = 0

}