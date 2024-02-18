package unittest.cs105;

public class AtmPin {
	private String last;
	private String pin;
	private int attempts =0;
	
	public AtmPin(String actualCode) {
		pin=actualCode;
	}
	public boolean verifyPinCode(String code) {
		last = code;
		
		if(code==null) {
			attempts = attempts +1;
			return false;
		}
		if(code.equals(pin)&&isBlocked()==false) {
			return true;
		}
		else {
			attempts = attempts +1;
			return false;
		}
	}
	public boolean lastAttemptFailed() {
		if(last.equals(pin)) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean isBlocked() {
		if(attempts>=4) {
			return true;
		}
		else {
			return false;
		}
	}
	public void resetPasswordAttempts() {
		attempts = 0;
	}
	public boolean isBadPassword() {
		if(lastAttemptFailed() == true) {
			return true;
			
		}
		else {
			return false;
		}
	}
	public boolean changePinCode(String newPinCode) {
		if(newPinCode.length()==4) {
			pin = newPinCode;
			return true;
		}
		return false;
	}
}


