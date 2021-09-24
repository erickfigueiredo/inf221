package main;

import org.junit.*;
import static org.junit.Assert.*;

public class ChampionshipTest {

	@Test
	public void testNumMatches() {
		
		Championship c = new Championship(12);
		
		assertEquals(66, c.getNumMatches());
	}
	
	@Test
	public void testTeamPoint() {
		
		Championship c = new Championship(5);
		
		c.addMatch(1, 102, 2, 62);
		c.addMatch(1, 128, 3, 127);
		c.addMatch(1, 144, 4, 80);
		c.addMatch(1, 102, 5, 101);
		c.addMatch(2, 62, 3, 61);
		c.addMatch(2, 100, 4, 80);
		c.addMatch(2, 88, 5, 82);
		c.addMatch(3, 79, 4, 90);
		c.addMatch(3, 87, 5, 100);
		c.addMatch(4, 110, 5, 99);
		assertEquals(8, c.getTeamById(1).getScore());
	}
	
	@Test
	public void testChamp1() {
		
		Championship c = new Championship(3);
		
		c.addMatch(1, 30, 2, 10);
		c.addMatch(1, 10, 3, 30);
		c.addMatch(2, 40, 3, 10);
		assertEquals("2 1 3\n", c.getClassification());
	}
	
	@Test
	public void testChamp2() {
		
		Championship c = new Championship(3);
		
		c.addMatch(1, 30, 2, 10);
		c.addMatch(1, 10, 3, 0);
		c.addMatch(2, 40, 3, 10);
		assertEquals("1 2 3\n", c.getClassification());
	}
	
	@Test
	public void testChamp3() {
		
		Championship c = new Championship(5);
		
		c.addMatch(1, 102, 2, 62);
		c.addMatch(1, 128, 3, 127);
		c.addMatch(1, 144, 4, 80);
		c.addMatch(1, 102, 5, 101);
		c.addMatch(2, 62, 3, 61);
		c.addMatch(2, 100, 4, 80);
		c.addMatch(2, 88, 5, 82);
		c.addMatch(3, 79, 4, 90);
		c.addMatch(3, 87, 5, 100);
		c.addMatch(4, 110, 5, 99);
		assertEquals("1 2 4 5 3\n", c.getClassification());
	}
	
	@Test
	public void testChamp4() {
		
		Championship c = new Championship(3);
		
		c.addMatch(1, 2, 3, 4);
		c.addMatch(1, 4, 2, 2);
		c.addMatch(2, 4, 3, 2);
		assertEquals("1 2 3\n", c.getClassification());
	}
	
	@Test
	public void testChamp5() {
		
		Championship c = new Championship(10);
		
		c.addMatch(1, 97, 2, 20);
		c.addMatch(1, 50, 3, 70);
		c.addMatch(1, 51, 4, 86);
		c.addMatch(1, 49, 5, 91);
		c.addMatch(1, 87, 6, 76);
		c.addMatch(1, 27, 7, 20);
		c.addMatch(1, 130, 8, 64);
		c.addMatch(1, 20, 9, 103);
		c.addMatch(1, 31, 10, 11);
		c.addMatch(2, 24, 3, 41);
		c.addMatch(2, 3, 4, 50);
		c.addMatch(2, 110, 5, 129);
		c.addMatch(2, 66, 6, 3);
		c.addMatch(2, 42, 7, 14);
		c.addMatch(2, 87, 8, 33);
		c.addMatch(2, 53, 9, 28);
		c.addMatch(2, 97, 10, 53);
		c.addMatch(3, 9, 4, 102);
		c.addMatch(3, 62, 5, 18);
		c.addMatch(3, 93, 6, 57);
		c.addMatch(3, 77, 7, 18);
		c.addMatch(3, 82, 8, 119);
		c.addMatch(3, 92, 9, 76);
		c.addMatch(3, 86, 10, 101);
		c.addMatch(4, 12, 5, 122);
		c.addMatch(4, 42, 6, 110);
		c.addMatch(4, 108, 7, 14);
		c.addMatch(4, 17, 8, 22);
		c.addMatch(4, 35, 9, 43);
		c.addMatch(4, 76, 10, 59);
		c.addMatch(5, 87, 6, 122);
		c.addMatch(5, 45, 7, 128);
		c.addMatch(5, 100, 8, 53);
		c.addMatch(5, 71, 9, 53);
		c.addMatch(5, 110, 10, 32);
		c.addMatch(6, 49, 7, 34);
		c.addMatch(6, 23, 8, 56);
		c.addMatch(6, 1, 9, 15);
		c.addMatch(6, 101, 10, 114);
		c.addMatch(7, 106, 8, 87);
		c.addMatch(7, 66, 9, 112);
		c.addMatch(7, 126, 10, 17);
		c.addMatch(8, 39, 9, 44);
		c.addMatch(8, 86, 10, 13);
		c.addMatch(9, 71, 10, 73);
		assertEquals("5 3 4 9 2 1 8 7 6 10\n", c.getClassification());
	}
}
