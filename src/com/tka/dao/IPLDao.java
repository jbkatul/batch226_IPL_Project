package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {

	public List<Player> getCSKTeam() {
		System.out.println("We are in IPL Dao -> getCSKTeam method.");
		// Logic to creatd csk team List
		List<Player> cskteam = new ArrayList<Player>();

		Player p1 = new Player(7, "MSD", 6000, 0, "CSK");
		Player p2 = new Player(11, "Rutu", 2500, 0, "CSK");
		Player p3 = new Player(27, "Ravindra", 4500, 100, "CSK");

		cskteam.add(p1);
		cskteam.add(p2);
		cskteam.add(p3);

		return null;
	}

}
