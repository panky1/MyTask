package com.pankaj.mytask.ui.splash

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import com.pankaj.mytask.R
import com.pankaj.mytask.databinding.ActivitySplashBinding
import com.pankaj.mytask.ui.base.BaseActivity
import com.pankaj.mytask.ui.home.HomeActivity


class SplashActivity : BaseActivity<ActivitySplashBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_splash
    override val currentFragment: Fragment?
        get() = null
    override val fragmentContainerId: Int
        get() = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            object :CountDownTimer(3000,1000){
                override fun onTick(millisUntilFinished: Long) {}

                override fun onFinish() {
                    finish()
                    openActivity(HomeActivity::class.java)
                }

            }.start()
    }
}