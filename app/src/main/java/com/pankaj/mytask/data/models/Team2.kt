package com.pankaj.mytask.data.models

import com.google.gson.annotations.SerializedName

data class Team2(@SerializedName("Name_Full") val name_Full : String,
                 @SerializedName("Name_Short") val name_Short : String,
                 @SerializedName("Players") val players : TeamPlayersInfo2)