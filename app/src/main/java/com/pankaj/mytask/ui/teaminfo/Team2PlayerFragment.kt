package com.pankaj.mytask.ui.teaminfo

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.pankaj.mytask.R
import com.pankaj.mytask.data.models.TeamInfoData
import com.pankaj.mytask.data.models.TeamPlayersInfo2
import com.pankaj.mytask.databinding.FragmentTeam2playerBinding
import com.pankaj.mytask.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_team1player.*

class Team2PlayerFragment : BaseFragment<FragmentTeam2playerBinding>() {
    private lateinit var teamDataList: MutableList<TeamInfoData>
    private var teamPlayersInfo2:TeamPlayersInfo2?= null
    override val layoutResourceId: Int
        get() = R.layout.fragment_team2player

    companion object{
        fun newInstance(teamPlayersInfo2: TeamPlayersInfo2):Team2PlayerFragment{
            val team2PlayerFragment = Team2PlayerFragment()
            val args = Bundle()
            args.putParcelable("TEAM2DATA", teamPlayersInfo2)
            team2PlayerFragment.setArguments(args)
            return team2PlayerFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        teamPlayersInfo2 = arguments?.getParcelable("TEAM2DATA")!!

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        teamDataList = mutableListOf()
        teamDataList.add(teamPlayersInfo2?.player1?.let {
            teamPlayersInfo2?.player1?.javaClass?.kotlin?.members?.let { it1 ->
                TeamInfoData(it.name_Full,
                    it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
            }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player2?.let {  teamPlayersInfo2?.player2?.javaClass?.kotlin?.members?.let { it1 ->
                TeamInfoData(it.name_Full,
                    it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
            }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player3?.let {  teamPlayersInfo2?.player3?.javaClass?.kotlin?.members?.let { it1 ->
                TeamInfoData(it.name_Full,
                    it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
            }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player4?.let {  teamPlayersInfo2?.player4?.javaClass?.kotlin?.members?.let { it1 ->
                TeamInfoData(it.name_Full,
                    it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
            }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player5?.let {  teamPlayersInfo2?.player5?.javaClass?.kotlin?.members?.let { it1 ->
                TeamInfoData(it.name_Full,
                    it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
            }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player6?.let { teamPlayersInfo2?.player6?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player7?.let {  teamPlayersInfo2?.player7?.javaClass?.kotlin?.members?.let { it1 ->
                TeamInfoData(it.name_Full,
                    it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
            }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player8?.let {  teamPlayersInfo2?.player8?.javaClass?.kotlin?.members?.let { it1 ->
                TeamInfoData(it.name_Full,
                    it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
            }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player9?.let {  teamPlayersInfo2?.player9?.javaClass?.kotlin?.members?.let { it1 ->
            TeamInfoData(it.name_Full,
                it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
        }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player10?.let {  teamPlayersInfo2?.player10?.javaClass?.kotlin?.members?.let { it1 ->
                TeamInfoData(it.name_Full,
                    it1.any { it.name == "iscaptain" },it1.any { it.name == "iskeeper" })
            }
        }!!)
        teamDataList.add(teamPlayersInfo2?.player11?.let {  teamPlayersInfo2?.player11?.javaClass?.kotlin?.members?.let { it1 ->
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