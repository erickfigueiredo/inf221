package prog;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestProg1A {
	
	ArrayList <Integer> distA, distD;
	
	@Test
	public void testZeroDefenders() {
		distA = new ArrayList<Integer>();
		distD = new ArrayList<Integer>();
		
		distA.add(18);
		distA.add(2950);
		distA.add(27);
		
		assertEquals('Y', Main.isOffside(distA, distD));
	}

	@Test
	public void testNoOffside() {
		distA = new ArrayList<Integer>();
		distD = new ArrayList<Integer>();
		
		distA.add(189);
		distA.add(124);
		distA.add(9540);
		distA.add(827);
		
		distD.add(1);
		distD.add(124);
		distD.add(223);
		distD.add(327);
		
		assertEquals('N', Main.isOffside(distA, distD));
	}
	
	@Test
	public void testNoOffsideSameLineOfDefenders() {
		distA = new ArrayList<Integer>();
		distD = new ArrayList<Integer>();
		
		distA.add(189);
		distA.add(4);
		distA.add(9540);
		distA.add(827);
		
		distD.add(4);
		distD.add(4);
		distD.add(395);
		assertEquals('N', Main.isOffside(distA, distD));
	}
	
	@Test
	public void testOffside() {
		distA = new ArrayList<Integer>();
		distD = new ArrayList<Integer>();
		
		distA.add(189);
		distA.add(123);
		distA.add(9540);
		distA.add(827);
		
		distD.add(124);
		distD.add(123);
		distD.add(233);
		distD.add(257);
		distD.add(570);
		
		assertEquals('Y', Main.isOffside(distA, distD));
	}
	
	@Test
	public void testOffsideCompleteGame() {
		distA = new ArrayList<Integer>();
		distD = new ArrayList<Integer>();
		
		distA.add(123);
		distA.add(123);
		distA.add(58);
		distA.add(768);
		distA.add(34);
		distA.add(123);
		distA.add(32);
		distA.add(546);
		distA.add(698);
		distA.add(54);
		distA.add(34);
		
		distD.add(124);
		distD.add(123);
		distD.add(233);
		distD.add(257);
		distD.add(570);
		distD.add(123);
		distD.add(233);
		distD.add(257);
		distD.add(570);
		distD.add(123);
		distD.add(233);
		
		assertEquals('Y', Main.isOffside(distA, distD));
	}
}
