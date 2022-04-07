package lights;

import org.junit.Assert;
import org.junit.Test;

public class LightTest {

	@Test public void makeOffLight() {
		Light light = new Light();
		
		Assert.assertFalse(light.isOn());
	}
	
	@Test public void makeOnLight() {
		Light light = new Light(true);
		
		Assert.assertTrue(light.isOn());
	}

	@Test public void turnOnLight() {
		Light light = new Light();
		light.setOn(true);
		
		Assert.assertTrue(light.isOn());
	}
	
	@Test public void turnOffLight() {
		Light light = new Light(true);
		light.setOn(false);
		
		Assert.assertFalse(light.isOn());
	}
	
	@Test public void turnOnOnlyOneLight() {
		Light firstLight = new Light();
		Light secondLight = new Light();
		
		firstLight.setOn(true);
		
		Assert.assertTrue(firstLight.isOn());
		Assert.assertFalse(secondLight.isOn());
	}
	
	@Test public void testRandomChange() {
		Light light = new Light(false);
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		boolean lightChanged = false;
		for (int i = 0; i < 100; i++) {
			light.randomChange();
			if (light.isOn()) {
				lightChanged = true;
				break;
			}
		}
		Assert.assertTrue(lightChanged);
		
		// Make sure it can change the other way
		light = new Light(true);
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		lightChanged = false;
		for (int i = 0; i < 100; i++) {
			light.randomChange();
			if (!light.isOn()) {
				lightChanged = true;
				break;
			}
		}
		Assert.assertTrue(lightChanged);
	}
	
}