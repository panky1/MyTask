package com.pankaj.mytask.data.repo

import com.pankaj.mytask.data.remote.api.MyTaskApiService
import javax.inject.Inject

class MyAppRepo @Inject constructor(private val apiService: MyTaskApiService) {
    suspend fun getAllTeamList() = apiService.getAllTeamList()
}