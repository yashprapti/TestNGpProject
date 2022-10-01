package agileTech.testNGProject;

import org.testng.annotations.DataProvider;

public class DataPro {
	
	@ DataProvider
	public Object[][] dataMethod() {
		Object[][] data = {{"Admin","Admin123"},{"admin","admin123"},{"useradmin","useradmin123"}};
		return data;
	}
}
