package unittest.cs105;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemperatureStatsTester {
	private static final int maximumScore = 15;

	private static int totalScore;

	private TemperatureStats ts;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

	}

	@Before
	public void setUp() {
		this.ts = new TemperatureStats();
		ts.addTemperature(0);
		ts.addTemperature(100);
		ts.addTemperature(73);
		ts.addTemperature(90);
		ts.addTemperature(120);
		ts.addTemperature(32);
		ts.addTemperature(45);
		ts.addTemperature(80);
	}

	@After
	public void tearDown() {
		this.ts = null;
	}

	@Test
	public void testMaximum() {
		assertEquals("Maximum not correct.", 120.0, ts.getMaximumTemperature(), 0.1);
		totalScore += 2;
	}

	@Test
	public void testMinimum() {
		assertEquals("Minimum not correct.", 0.0, ts.getMinimumTemperature(), 0.1);
		totalScore += 4;
	}

	@Test
	public void testAverage() {
		assertEquals("Average not correct.", 67.5, ts.getAverageTemperature(), 0.1);
		totalScore += 6;
	}

	@Test
	public void testClear() {
		assertEquals("Maximum not correct.", 120.0, ts.getMaximumTemperature(), 0.1);
		assertEquals("Minimum not correct.", 0.0, ts.getMinimumTemperature(), 0.1);
		assertEquals("Average not correct.", 67.5, ts.getAverageTemperature(), 0.1);

		ts.clearTemperatures();

		ts.addTemperature(10);
		ts.addTemperature(110);
		ts.addTemperature(60);

		assertEquals("Maximum not correct.", 110.0, ts.getMaximumTemperature(), 0.1);
		assertEquals("Minimum not correct.", 10.0, ts.getMinimumTemperature(), 0.1);
		assertEquals("Average not correct.", 60.0, ts.getAverageTemperature(), 0.1);

		totalScore += 3;
	}
}
