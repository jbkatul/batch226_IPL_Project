package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLTeamController {

	public List<Player> getCSKTeam() {
		System.out.println("We are in IPL Controller -> getCSKTeam method.");
		
		IPLService iplservice = new IPLService();
		
		List<Player> cskteam = iplservice.getCSKTeam();
		
		return null;
	}

}
