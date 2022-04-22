package lights;

import org.junit.Assert;
import org.junit.Test;

public class MyHolidayLightsTest {

	@Test public void makeOffLight()  {
		MyHolidayLights Light = new MyHolidayLights(10);
		Light.next().get(0).setOn(false);
		Assert.assertFalse(Light.next().get(0).isOn());
	}
	
	@Test public void makeOnLight() {
		MyHolidayLights Light = new MyHolidayLights(10);
		
		
		Assert.assertTrue(Light.next().get(9).isOn());
	}

	@Test public void turnOnLight() {
		MyHolidayLights Light = new MyHolidayLights(10);
		
		Assert.assertTrue(Light.next().get(1).isOn());
	}
	
	@Test public void turnOffLight() {
		MyHolidayLights Light = new MyHolidayLights(10);
		Light.next().get(1).setOn(false);
		
		Assert.assertFalse(Light.next().get(1).isOn());
	}
	
	@Test public void turnOnOnlyOneLight() {
	    MyHolidayLights firstLight = new MyHolidayLights(10);
		MyHolidayLights secondLight = new MyHolidayLights(10);
		
		firstLight.next().get(1).setOn(true);
		secondLight.next().get(1).setOn(false);
		Assert.assertTrue(firstLight.next().get(1).isOn());
		Assert.assertFalse(secondLight.next().get(1).isOn());
	}
	
	@Test public void testRandomChange() {
		MyHolidayLights light = new MyHolidayLights(10);
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		boolean lightChanged = false;
		for (int i = 0; i < 10; i++) {
			light.next().get(i).randomChange();
			if (light.next().get(i).isOn()) {
				lightChanged = true;
				break;
			}
		}
		Assert.assertTrue(lightChanged);
		
	
	}
	
}