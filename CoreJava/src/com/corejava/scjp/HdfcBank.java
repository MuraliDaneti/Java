/**
 * 
 */
package com.corejava.scjp;

/**
 * @author Murali
 *
 */
public class HdfcBank implements RbiBank{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HdfcBank hb = new HdfcBank();
		hb.withdrawl();
		hb.CashDeposit();
		}

	public void withdrawl() {
		
		System.out.println("Welcome to HDFC WithDrawl Service.!");
		
	}

	public void CashDeposit() {
		
		System.out.println("Welcome to HDFC CashDeposit Service..!");
		
	}

}
