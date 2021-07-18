package com.pankaj.mytask.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.pankaj.mytask.data.models.TeamsData
import com.pankaj.mytask.ui.teaminfo.Team1PlayerFragment
import com.pankaj.mytask.ui.teaminfo.Team2PlayerFragment

class PagerAdapter(supportFragmentManager: FragmentManager, teamsData: TeamsData?) : FragmentPagerAdapter(supportFragmentManager) {

    private var teamsData: TeamsData?
    private var teamNameList: MutableList<String>

    init {
        teamNameList = mutableListOf()
        teamsData?.team1?.name_Full?.let { teamNameList.add(it) }
        teamsData?.team2?.name_Full?.let { teamNameList.add(it) }
        this.teamsData = teamsData
    }
    override fun getCount(): Int {
        return teamNameList.size
    }


    override fun getItem(position: Int): Fragment {
         when (position) {
            0 -> {
                return teamsData?.team1?.let { Team1PlayerFragment.newInstance(it.players) }!!
            }
            1 -> {
                return teamsData?.team2?.let { Team2PlayerFragment.newInstance(it.players) }!!
            }
            else -> {
                return teamsData?.team1?.let { Team1PlayerFragment.newInstance(it.players) }!!
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return teamNameList.get(position)
    }

}
