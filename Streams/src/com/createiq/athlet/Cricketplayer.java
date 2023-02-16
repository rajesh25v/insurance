package com.createiq.athlet;

import java.util.Date;

public class Cricketplayer extends Athlet{
	private int numberOfCenturies;
	private int numberOfOffcenturies;
	private int points;
	private double bowleningAverage;


	public Cricketplayer(String name, String nickName, Date dateOfBirth, String team, int numberOfMatches,
			int numberOfCenturies, int numberOfOffcenturies, int points, double bowleningAverage) {
		super(name, nickName, dateOfBirth, team, numberOfMatches);
		this.numberOfCenturies = numberOfCenturies;
		this.numberOfOffcenturies = numberOfOffcenturies;
		this.points = points;
		this.bowleningAverage = bowleningAverage;
	}
	


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}



	@Override
	public String getNickName() {
		// TODO Auto-generated method stub
		return super.getNickName();
	}



	@Override
	public String getTeam() {
		
		return super.getTeam();
	}



	@Override
	public void getBioData() {
		super.getBioData();
		System.out.println("number of cenr+turies: "+numberOfCenturies);
		super.getBioData();
	}
	@Override
	public void compititions() {
		super.compititions();
		System.out.println("number of points :"+points);

		super.compititions();
	}
	
	@Override
	public String bodyType() {
		// TODO Auto-generated method stub
		return null;
	}

}
