package com.tka.entity;

public class Player {
	private int jno;
	private String pname;
	private int runs;
	private int wickets;
	private String tname;

	public Player() {
		super();
	}

	public Player(int jno, String pname, int runs, int wickets, String tname) {
		super();
		this.jno = jno;
		this.pname = pname;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		this.jno = jno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Player [pname=" + pname + ", tname=" + tname + "]";
	}

}
