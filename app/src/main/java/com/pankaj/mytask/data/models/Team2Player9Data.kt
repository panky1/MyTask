package com.pankaj.mytask.data.models

import com.google.gson.annotations.SerializedName

data class Team2Player9Data(@SerializedName("Position") val position : Int,
                       @SerializedName("Name_Full") val name_Full : String,
                       @SerializedName("Iskeeper") val iskeeper : Boolean)
