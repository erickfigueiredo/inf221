package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		int nTeams, idT1, idT2, basketT1, basketT2;
		Championship champ;
		
		nTeams = key.nextInt();
		champ = new Championship(nTeams);
		
		for(int i = 0; i < champ.getNumMatches(); i++) {
			idT1 = key.nextInt();
			basketT1 = key.nextInt();
			idT2 = key.nextInt();
			basketT2 = key.nextInt();
			champ.addMatch(idT1, basketT1, idT2, basketT2);
		}
		
		System.out.println(champ.getClassification());
		key.close();
	}
}
