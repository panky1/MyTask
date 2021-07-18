package com.pankaj.mytask.data.models

import com.google.gson.annotations.SerializedName

data class TeamListData(
    @SerializedName("Teams") val teamsData : TeamsData,
)
