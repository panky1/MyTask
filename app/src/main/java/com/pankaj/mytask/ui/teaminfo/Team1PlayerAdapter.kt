package com.pankaj.mytask.ui.teaminfo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.pankaj.mytask.R
import com.pankaj.mytask.data.models.TeamInfoData
import com.pankaj.mytask.databinding.ItemTeamlistBinding

class Team1PlayerAdapter (var teamList : List<TeamInfoData>) : RecyclerView.Adapter<Team1PlayerAdapter.TeamListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return TeamListViewHolder(
            DataBindingUtil.inflate(inflater,
            R.layout.item_teamlist, parent, false))
    }

    override fun getItemCount(): Int {
        return teamList.size
    }

    override fun onBindViewHolder(holder: TeamListViewHolder, position: Int) {
        val team = teamList[position]
//        holder.binding.teamData = team
        val captain:String = if (team.iscaptain) "(c)" else ""
        val wkData: String = if (team.iskeeper) "(wk)" else ""
        holder.binding.tvText.text = team.name_Full+" "+captain+" "+wkData



        holder.binding.executePendingBindings()
    }


    inner class TeamListViewHolder(val binding : ItemTeamlistBinding)
        : RecyclerView.ViewHolder(binding.root)
}