package com.pankaj.mytask.ui.teaminfo

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.pankaj.mytask.R
import com.pankaj.mytask.data.models.TeamInfoData
import com.pankaj.mytask.data.models.TeamPlayersInfo1
import com.pankaj.mytask.databinding.FragmentTeam1playerBinding
import com.pankaj.mytask.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_team1player.*
import java.lang.reflect.Field


class Team1PlayerFragment : BaseFragment<FragmentTeam1playerBinding>() {

    private lateinit var teamDataList: MutableList<TeamInfoData>
    private var teamPlayersInfo1: TeamPlayersInfo1? = null
    override val layoutResourceId: Int
        get() = R.layout.fragment_team1player

    companion object{
        fun newInstance(teamPlayersInfo1: TeamPlayersInfo1):Team1PlayerFragment{
            val team1PlayerFragment = Team1PlayerFragment()
            val args = Bundle()
            args.putParcelable("TEAM1DATA", teamPlayersInfo1)
            team1PlayerFragment.setArguments(args)
            return team1PlayerFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        teamPlayersInfo1 = arguments?.getParcelable("TEAM1DATA")!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        teamDataList = mutableListOf()
        teamDataList.add(teamPlayersInfo1?.player1?.let { teamPlayersInfo1?.player1?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player2?.let { teamPlayersInfo1?.player2?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player3?.let { teamPlayersInfo1?.player3?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player4?.let { teamPlayersInfo1?.player4?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player5?.let { teamPlayersInfo1?.player5?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player6?.let { teamPlayersInfo1?.player6?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player7?.let { teamPlayersInfo1?.player7?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player8?.let { teamPlayersInfo1?.player8?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player9?.let { teamPlayersInfo1?.player9?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player10?.let { teamPlayersInfo1?.player10?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo1?.player11?.let { teamPlayersInfo1?.player11?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        val team1PlayerAdapter = Team1PlayerAdapter( teamDataList)
        rvlist.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = team1PlayerAdapter
        }
    }






}