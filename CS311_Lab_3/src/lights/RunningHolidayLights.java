package lights;

import java.util.List;

public class RunningHolidayLights implements HolidayLights {
	
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	private int length;
	
	public RunningHolidayLights(int length) {
		this.length=length;
		//throw new RuntimeException("RunningHolidayLights(length) not yet implemented!");
	}
	
	public List<Light> next() {
		// TODO
		next().add(null);
		throw new RuntimeException("RunningHolidayLights.next() not yet implemented!");
	}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		// TODO
		//throw new RuntimeException("RunningHolidayLights.getLength() not yet implemented!");
		return length;
	}
						
}