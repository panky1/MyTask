package com.pankaj.mytask.data.remote.api

import com.pankaj.mytask.data.models.TeamListData
import com.pankaj.mytask.data.remote.api.config.Urls
import retrofit2.http.GET

interface MyTaskApiService {
    @GET(Urls.getTeamData)
    suspend fun getAllTeamList() : TeamListData
}