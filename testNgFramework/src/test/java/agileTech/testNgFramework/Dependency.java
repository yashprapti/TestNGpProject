package agileTech.testNgFramework;

import org.testng.annotations.Test;

public class Dependency {
	
	@Test(groups="Regression")
	public void login()
	{
		System.out.println("login is successfull");
	}
	
	@Test(groups="Sanity")
	public void InboxCheck() {
		System.out.println("Inbox Check successfull");
	}

}
