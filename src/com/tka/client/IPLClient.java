package com.tka.client;

import java.util.List;

import com.tka.controller.IPLTeamController;
import com.tka.entity.Player;

public class IPLClient {

	public static void main(String[] args) {

		System.out.println("We are in IPL Client");

		IPLTeamController iplcontroller = new IPLTeamController();

		List<Player> cskteam = iplcontroller.getCSKTeam();
		System.out.println(cskteam);
		
//		List<Player> MIteam = iplcontroller.getMITeam();
//		List<Player> RCBteam = iplcontroller.getRCBTeam();
//		List<Player> DCteam = iplcontroller.getDCTeam();

	}

}
