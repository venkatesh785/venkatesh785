package testNGDemo;

import org.testng.annotations.Test;

public class BankAccount {
	@Test(priority=1,enabled=false)
	public void ApplyBankAccount() {
		System.out.println("accont applied sucessflly....");
	}
	@Test
	public void createBankAccount() {
		System.out.println("amount creadited sucessflly....");
	}
	@Test
	public void depositAmount() {
		System.out.println("amont deposited sucessflly....");
	}
	@Test
	public void withDrawnAmunt() {
		System.out.println("accont applied sucessflly....");
	}

}
