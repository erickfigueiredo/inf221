package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Championship {
	
	private int numTeams, numMatches;
	private ArrayList <Team> teams;
	
	public Championship(int nTeams) {
		
		setNumTeams(nTeams);
		setNumMatches(nTeams);
		setTeams(nTeams);
	}
	
	public void addMatch(int t1, int basketT1, int t2, int basketT2) {
		
		teams.get(t1-1).calcScore(basketT1, basketT2);
		teams.get(t2-1).calcScore(basketT2, basketT1);
	}
	
	private void calcResult() {
		
		Comparator<Team> comp = (Team team1, Team team2) -> {
			return team1.compareTo(team2);
		};
		
		Collections.sort(teams, comp);
	}
	
	public int getNumMatches() {
		
		return numMatches;
	}
	
	public String getClassification() {
		
		String classification = "";
		
		calcResult();
		
		for(int i = 0; i < numTeams; i++) {
			if(i == 0) {
				classification = Integer.toString(teams.get(i).getId());
			} else {
				classification += " " + teams.get(i).getId();
			}
		}
		
		classification += '\n';
		
		return classification;
	}
	
	public Team getTeamById(int id) {
		
		return teams.get(id-1);
	}
	
	public void getRelatory() {
		
		for(int i = 0; i < numTeams; i++) {			
			teams.get(i).getInfo();
		}
	}
	
	private void setNumTeams(int num) {
		
		numTeams = num;
	}
	
	private void setNumMatches(int num) {
		
		numMatches = (num * (num - 1)) / 2;
	}
	
	private void setTeams(int num) {
		
		teams = new ArrayList<Team>();
		
		for(int i = 0; i < num; i++) {
			teams.add(new Team(i+1));
		}
	}
}
