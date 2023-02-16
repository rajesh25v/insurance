package com.createiq.atlet;

abstract class Athlet {
	private String name;
	private String team;
	private int playedGames;
	private int yob;
	private double height;
	private int weight;

	public abstract void gameDetails(String playedGames, String team);

	public abstract void playersDetails(String name, int yob);

	public abstract void personDetails(String name, double height, int weight);

	@Override
	public String toString() {
		return "Athlet [name=" + name + ", team=" + team + ", playedGames=" + playedGames + ", yob=" + yob + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getPlayedGames() {
		return playedGames;
	}

	public void setPlayedGames(int playedGames) {
		this.playedGames = playedGames;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}

	public Athlet(String name, String team, int playedGames, int yob, double height, int weight) {
		super();
		this.name = name;
		this.team = team;
		this.playedGames = playedGames;
		this.yob = yob;
		this.height = height;
		this.weight = weight;

	}


	
}
