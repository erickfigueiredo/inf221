package main;

public class Team {
	
	private int id, championshipScore = 0, basketsMade = 0, basketsSuffered = 0;
	
	public Team(int id) {
		
		setId(id);
	}
	
	public void calcScore(int made, int suffered) {
		
		if(made > suffered) {
			countVictory(true);
		} else {
			countVictory(false);
		}
		
		basketsMade += made;
		basketsSuffered += suffered;
	}
	
	public int getId() {
		
		return id;
	}
	
	public int getScore() {
		
		return championshipScore;
	}
	
	public int getBasketsMade() {
		
		return basketsMade;
	}
	
	public float getAverage() {
		
		return basketsSuffered == 0 ? basketsMade : (float)basketsMade/(float)basketsSuffered;
	}
	
	public int compareTo(Team other) {
		
		if (getScore() != other.getScore()) {
			 return other.getScore() - getScore();
		 }
		 
		 if (getAverage() != other.getAverage()) {
		    if (other.getAverage() > getAverage()) {
		    	return 1;
		    } else {
		    	return -1;
		    }
		 }
		   
		 if (getBasketsMade() != other.getBasketsMade()) {
			 return other.getBasketsMade() - getBasketsMade();
		 }
		 
		 return getId() - other.getId();
	}
	
	public void getInfo() {
		
		System.out.println("Pontuação: " + getScore() + " Média : " + getAverage() + " Cestas: " + getBasketsMade() + " ID: " + getId());
	}
	
	private void countVictory(boolean status) {
		
		if(status) {
			championshipScore += 2;
		} else {
			championshipScore++;
		}
	}
	
	private void setId(int id) {
		
		this.id = id;
	}
}
