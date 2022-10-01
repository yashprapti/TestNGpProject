package agileTech.testNgFramework;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
	
	@DataProvider
	public Object[][] dataSet() {
		
		Object[][] data = {{"Admin","Admin123"},{"Admin","Admin345"},
				{"username","Admin123"},
				{"username","Admin354"}};
		return data;
	}
}
