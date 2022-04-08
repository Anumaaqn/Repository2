package lights;

import java.awt.Color;
import java.util.Random;

public class ColoredLight extends Light{
	
	Color color;
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */
	public ColoredLight(Color color) {
	
		super(true);
		this.color= color;
		
		//throw new RuntimeException("ColoredLight(Color) not yet implemented!");
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public Color getColor() {
		// TODO
		
		//throw new RuntimeException("ColoredLight.getColor() not yet implemented!");
		return this.color;
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		// TODO
		//throw new RuntimeException("ColoredLight.setColor() not yet implemented!");
		c= this.color;
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		double a;
		a = Math.random();
		if(a<0.2) {
			color = Color.blue;
		}
		else if(a>=0.3&&a<0.6) {
			color = Color.white;
		}
		else if(a>=0.6&&a<0.9) {
			color = Color.black;
		}
		else if(a>=0.9&&a<1) {
			color = Color.orange;
		}
		
		}
		//throw new RuntimeException("ColoredLight.randomChange() not yet implemented!");
	
}