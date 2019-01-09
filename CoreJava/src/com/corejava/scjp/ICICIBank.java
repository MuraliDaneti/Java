package com.corejava.scjp;

public class ICICIBank extends Rbi2Bank{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ICICIBank icb = new ICICIBank();		
		icb.MiniStatement();
		icb.PinChange();
	}

	public void MiniStatement() {
		
		System.out.println("This is ICICI Bank MiniStatement Service..!");		
	}

	public void PinChange() {
		
		System.out.println("This is ICICI Bank PinChange Service..!");		
	}

}
