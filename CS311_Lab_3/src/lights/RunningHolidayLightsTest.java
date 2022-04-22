package lights;

import org.junit.Assert;
import org.junit.Test;

public class RunningHolidayLightsTest{
	
	
	@Test public void makeLengthOfList() {
		RunningHolidayLights runHolLight = new RunningHolidayLights(12);
		
		Assert.assertNotNull(runHolLight.getLength());
	}
	
	@Test public void listOfLightLength() {
		RunningHolidayLights runHolLight = new RunningHolidayLights(12);
		
		Assert.assertEquals(runHolLight.next().size(), runHolLight.getLength());
	}

	}