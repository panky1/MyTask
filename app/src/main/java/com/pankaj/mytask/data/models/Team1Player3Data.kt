package com.pankaj.mytask.data.models

import com.google.gson.annotations.SerializedName

data class Team1Player3Data(@SerializedName("Position") val position : Int,
                            @SerializedName("Name_Full") val name_Full : String,
                            @SerializedName("Iscaptain") val iscaptain : Boolean,
                            @SerializedName("Iskeeper") val iskeeper : Boolean)
