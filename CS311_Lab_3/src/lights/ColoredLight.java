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
		this.color= c;
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	
	public void randomChange() {
		Random rand= new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat() ;
		float b = rand.nextFloat() ;
		color = new Color(r, g, b);
		if (Math.random() < .5) {
			this.setOn(true);
		} else {
			this.setOn(false);
		}
	}
	
}