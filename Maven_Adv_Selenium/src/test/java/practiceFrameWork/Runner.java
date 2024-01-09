package practiceFrameWork;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Runner 
{
	@Test
	public void LoginTest()
	{
		
	}
	
	@DataProvider
	public void getData()
	{
		Object data [][]=new Object[5][2];
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<2; j++)
			{
				LoginDataProvider.getData("Sheet1",0,1);

			}
		}
	}

}
