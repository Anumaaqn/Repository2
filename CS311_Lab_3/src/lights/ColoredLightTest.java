package lights;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ColoredLightTest {

	@Test public void makeOffLight() {
		ColoredLight light = new ColoredLight(Color.BLACK);
		
		Assert.assertFalse(light.isOn());
	}
	
	@Test public void makeOnLight() {
		ColoredLight light = new ColoredLight(Color.PINK);
		
		Assert.assertTrue(light.isOn());
	}

	@Test public void turnOnLight() {
		ColoredLight light = new ColoredLight(Color.BLUE);
		light.setOn(true);
		
		Assert.assertTrue(light.isOn());
	}
	
	@Test public void turnOffLight() {
		ColoredLight light = new ColoredLight(Color.RED);
		light.setOn(false);
		
		Assert.assertFalse(light.isOn());
	}
	
	@Test public void turnOnOnlyOneLight() {
		ColoredLight firstLight = new ColoredLight(Color.RED);
		ColoredLight secondLight = new ColoredLight(Color.BLACK);
		
		firstLight.setOn(true);
		
		Assert.assertTrue(firstLight.isOn());
		Assert.assertFalse(secondLight.isOn());
	}
	
	@Test public void testRandomChange() {
		ColoredLight light = new ColoredLight(Color.RED);
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
		light = new ColoredLight(Color.RED);
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