package com.pankaj.mytask.data.models

import com.google.gson.annotations.SerializedName

data class TeamInfoData(@SerializedName("Name_Full") val name_Full : String,
                        @SerializedName("Iscaptain") val iscaptain : Boolean,
                        @SerializedName("Iskeeper") val iskeeper : Boolean)