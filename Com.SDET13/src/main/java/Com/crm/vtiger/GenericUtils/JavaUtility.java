package Com.crm.vtiger.GenericUtils;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public String getRandomData() {
		Random random= new Random();
		int ran = random.nextInt(1000);
		return ""+ran;
	}

	public String getTodayDate() {
		Date date=new Date();
		String currentdate = date.toString();
		return currentdate;
		
		
	}
}
