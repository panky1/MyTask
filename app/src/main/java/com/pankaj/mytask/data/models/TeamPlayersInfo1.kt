package com.pankaj.mytask.data.models

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Keep
@Parcelize
data class TeamPlayersInfo1(@SerializedName("2734") var player1 : @RawValue Team1Player1Data,
                            @SerializedName("3472") var player2 : @RawValue Team1Player2Data,
                            @SerializedName("4038") var player3 : @RawValue Team1Player3Data,
                            @SerializedName("57492") var player4 : @RawValue Team1Player4Data,
                            @SerializedName("59429") var player5 : @RawValue Team1Player5Data,
                            @SerializedName("63084") var player6 : @RawValue Team1Player6Data,
                            @SerializedName("64073") var player7 : @RawValue Team1Player7Data,
                            @SerializedName("64306") var player8 : @RawValue Team1Player8Data,
                            @SerializedName("64321") var player9 : @RawValue Team1Player9Data,
                            @SerializedName("65739") var player10 : @RawValue Team1Player10Data,
                            @SerializedName("66833") var player11 : @RawValue Team1Player11Data):Parcelable