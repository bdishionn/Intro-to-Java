package unittest.cs105;

import static java.lang.System.out;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AtmPinTester {
	private static final int maximumScore = 12;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

	}

	@Test
	public void testGoodPin() {

		final AtmPin ap = new AtmPin("4213");

		assertTrue("Should accept 4213.", ap.verifyPinCode("4213"));

		totalScore += 2;
	}

	@Test
	public void testBadPin() {

		final AtmPin ap = new AtmPin("4213");

		assertFalse("Should not accept 1337.", ap.verifyPinCode("1337"));

		totalScore += 2;
	}

	@Test
	public void testTooManyAttempts() {

		final AtmPin ap = new AtmPin("4213");

		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.isBadPassword());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isBlocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.isBadPassword());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isBlocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.isBadPassword());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isBlocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.isBadPassword());
		assertTrue("Blocked. Too many attempts.", ap.isBlocked());

		totalScore += 2;
	}

	@Test
	public void testTooManyAttemptsFollowedByGoodPassword() {

		final AtmPin ap = new AtmPin("4213");

		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.isBadPassword());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isBlocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.isBadPassword());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isBlocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.isBadPassword());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isBlocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.isBadPassword());
		assertTrue("Blocked. Too many attempts.", ap.isBlocked());
		assertFalse("Should not accept password because it should be blocked.", ap.verifyPinCode("4213"));
		assertFalse("Good password entered.", ap.isBadPassword());
		assertTrue("Blocked. Too many attempts.", ap.isBlocked());

		totalScore += 2;
	}

	@Test
	public void testResetBlocked() {

		final AtmPin ap = new AtmPin("4213");

		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.isBadPassword());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isBlocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.isBadPassword());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isBlocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.isBadPassword());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isBlocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.isBadPassword());
		assertTrue("Should be blocked.", ap.isBlocked());
		assertFalse("Should not accept password because it should be blocked.", ap.verifyPinCode("4213"));
		assertFalse("Good password entered.", ap.isBadPassword());
		assertTrue("Blocked. Too many attempts.", ap.isBlocked());

		ap.resetPasswordAttempts();
		assertTrue("Should accept password after reset.", ap.verifyPinCode("4213"));
		assertFalse("Good password entered.", ap.isBadPassword());
		assertFalse("Blocked. Too many attempts.", ap.isBlocked());

		totalScore += 2;
	}

	@Test
	public void testchangePinCode() {

		final AtmPin ap = new AtmPin("4213");

		ap.resetPasswordAttempts();
		assertTrue("Should accept password after reset.", ap.verifyPinCode("4213"));
		assertFalse("Good password entered.", ap.isBadPassword());
		assertFalse("Blocked. Too many attempts.", ap.isBlocked());
		assertTrue("The pinCode was succesfully changed.", ap.changePinCode("1111"));
		totalScore += 2;
	}

}
