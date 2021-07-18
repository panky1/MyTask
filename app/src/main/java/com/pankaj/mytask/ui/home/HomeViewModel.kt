package com.pankaj.mytask.ui.home

import android.content.Context
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.pankaj.mytask.R
import com.pankaj.mytask.data.models.TeamListData
import com.pankaj.mytask.data.remote.api.config.Resource
import com.pankaj.mytask.data.repo.MyAppRepo
import com.pankaj.mytask.ui.base.BaseViewModel
import com.pankaj.mytask.utils.NetworkUtils
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import com.pankaj.mytask.data.remote.api.config.Error

class HomeViewModel @ViewModelInject constructor(
    private val myAppRepo: MyAppRepo,
    @ApplicationContext private val context: Context,
    private val networkUtils: NetworkUtils
) : BaseViewModel() {
    var teamListLiveData = MutableLiveData<Resource<TeamListData>>()

    init {
        getTeamList()
    }

    private fun getTeamList() {
        if (networkUtils.isNetworkConnected()) {
            launchOnViewModelScope {
                teamListLiveData.value = Resource.loading()
                apiCall<TeamListData>{
                    onEnqueue = {
                        myAppRepo.getAllTeamList()
                    }
                    onSuccess = {
                        it?.let{
                            teamListLiveData.value = Resource.success(it)
                        }
                    }

                    onError = {
                        teamListLiveData.value = Resource.error(it)
                    }
                }
            }
        } else{
            teamListLiveData.value = Resource.error(
                Error(Error.ErrorType.NO_INTERNET_ERROR, context.getString(R.string.no_internet_connection)))
        }

    }
}