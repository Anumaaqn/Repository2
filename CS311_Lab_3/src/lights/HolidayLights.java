package lights;

import java.util.List;

/**
 * Represents a sequence of lights that periodically changes
 * appearence.
 */

public interface HolidayLights {

	/**
	 * Appearence of lights at next time slice.
	 * @return appearence of lights at next time slice.
	 */
	public List<Light> next();
	
}