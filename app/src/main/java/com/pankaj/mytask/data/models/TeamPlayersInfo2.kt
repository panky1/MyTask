package com.pankaj.mytask.data.models

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Keep
@Parcelize
data class TeamPlayersInfo2(@SerializedName("3667") var player1 : @RawValue Team2Player1Data,
                            @SerializedName("4356") var player2 : @RawValue Team2Player2Data,
                            @SerializedName("5313") var player3 : @RawValue Team2Player3Data,
                            @SerializedName("12518") var player4 : @RawValue Team2Player4Data,
                            @SerializedName("24669") var player5 : @RawValue Team2Player5Data,
                            @SerializedName("28891") var player6 : @RawValue Team2Player6Data,
                            @SerializedName("48191") var player7 : @RawValue Team2Player7Data,
                            @SerializedName("57458") var player8 : @RawValue Team2Player8Data,
                            @SerializedName("59736") var player9 : @RawValue Team2Player9Data,
                            @SerializedName("63611") var player10 : @RawValue Team2Player10Data,
                            @SerializedName("64221") var player11 : @RawValue Team2Player11Data):Parcelable
