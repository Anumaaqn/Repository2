package lights;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ColoredLightTest {

	@Test public void getColor() {
		ColoredLight light = new ColoredLight(Color.PINK);
		boolean b= true;
		if(light.getColor()==null) {b= false;}
		Assert.assertTrue(b);
	}

	
	@Test public void turnOffLight() {
		ColoredLight light = new ColoredLight(Color.RED);
		light.setOn(false);
		
		Assert.assertFalse(light.isOn());
	}
	
	@Test public void testRandomChange() {
	ColoredLight light = new ColoredLight(Color.RED);
		boolean lightChanged = false;
		lightChanged = false;
			light.randomChange();
			if (light.getColor()!=Color.RED ) {
				lightChanged = true;
		}
		Assert.assertTrue(lightChanged);
	}
	
}