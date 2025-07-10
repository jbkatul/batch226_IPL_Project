package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {

	public List<Player> getCSKTeam() {
		System.out.println("We are in IPL Service -> getCSKTeam method.");
		IPLDao ipldao = new IPLDao();
		List<Player> cskteam = ipldao.getCSKTeam();

		return null;
	}

}
